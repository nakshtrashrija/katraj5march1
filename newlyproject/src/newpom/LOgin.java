package newpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LOgin {
	
@FindBy(xpath = "//input[@id='userid']") private WebElement userID;
@FindBy(xpath = "//input[@id='password']") private WebElement Pass;
@FindBy(xpath="//button[@type='submit']")private WebElement Button;

public LOgin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
 public void SendUserName()
 {
	 userID.sendKeys("JM6075");
	 
 }
 public void PassWord()
 {
	 Pass.sendKeys("Shri@123");
 }
 public void clickonLogIN()
 {
	 Button.click();
 }







}



