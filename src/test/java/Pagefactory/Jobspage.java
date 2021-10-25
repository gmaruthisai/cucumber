package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobspage {
	
	public WebDriver driver;
  
  public void Jobspage1(WebDriver driver) 
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(id="menu_admin_viewAdminModule")
  WebElement Admin;
  
  @FindBy(id="menu_admin_Job")
  WebElement Job;
  
  @FindBy(id="menu_admin_viewJobTitleList")
  WebElement Joblist;
  
  @FindBy(id="btnAdd")
  WebElement Add;
  
  @FindBy(id="jobTitle_jobTitle")
  WebElement AddTitle;
  
  @FindBy(id="jobTitle_jobDescription")
  WebElement AddDesc;
  
  @FindBy(id="jobTitle_note")
  WebElement AddNote;
  
  @FindBy(id="btnSave")
  WebElement Save;
  
  
  public void Addjobs(String Title, String Desc, String Note) throws Exception
  
  {
	  Admin.click();
	  Job.click();
	  Joblist.click();
	  Add.click();
	  AddTitle.sendKeys(Title);
	  AddDesc.sendKeys(Desc);
	  AddNote.sendKeys(Note);
	  Save.click();
  }
  
  
  
  
  
}
