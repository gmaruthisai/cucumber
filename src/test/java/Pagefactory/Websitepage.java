package Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websitepage {
  
  WebDriver driver;
  
  public void Launch(WebDriver driver)
  
  {
	  this.driver=driver;
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe"); 
	  driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
}