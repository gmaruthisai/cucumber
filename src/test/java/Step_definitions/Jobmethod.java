package Step_definitions;






import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactory.Jobspage;
import Pagefactory.Loginpage;
import Pagefactory.Websitepage;
import io.cucumber.java.en.*;

public class Jobmethod  {
 
	WebDriver driver;
	@Given ("^to open my website$")
	    public void to_open_my_website() throws Throwable {

		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	     
	    }

	    @When("^I have entered valid \"(.*)\" and valid \"(.*)\"$")
	    public void i_have_entered_valid_and_valid(String Uname, String Pwd) throws Throwable {
	    
	    	Loginpage L1 = new Loginpage(driver);
			 
			 L1.Credentiallogin(Uname, Pwd);
	    	
	    	/*driver.findElement(By.id("txtUsername")).sendKeys(Uname);
	    	driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
	    	driver.findElement(By.id("btnLogin")).click();*/
	    }

	    @Then("^I created Addjobs Record \"(.*)\" \"(.*)\" \"(.*)\"$")
	    public void i_have_created_Jobs_Record(String Title, String Desc, String Note) throws Throwable {
	    	
	    	Jobspage J1 = new Jobspage();
	    	J1.Jobspage1(driver);
	    	J1.Addjobs(Title, Desc, Note);
	    	driver.close();
	    }
	 
	/* @Then("I created Addjobs Record {string} {string} {string}")
	 public void i_created_Addjobs_Record(String Title, String Desc, String Note)throws Throwable {
		 Jobspage J1 = new Jobspage();
	    	J1.Jobspage1(driver);
	    	J1.Addjobs(Title, Desc, Note);*/
		 
		 
	     // Write code here that turns the phrase above into concrete actions
	     //throw new io.cucumber.java.PendingException();
	 }

	



	    

	  
  

