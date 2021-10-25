package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	
	public WebDriver driver;

  public  Loginpage(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(id="txtUsername")
  WebElement UserName;
  
  @FindBy(id="txtPassword")
  WebElement Password;
 
  @FindBy(id="btnLogin")
  WebElement Button;
  
  
  
  
  
  
  
  
  
  public void Credentiallogin(String Uname, String Pwd)throws Exception
  {
	  
		
		UserName.sendKeys(Uname);
		Password.sendKeys(Pwd);
		Button.click();
	  
	  
  }
}
