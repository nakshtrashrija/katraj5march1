package KIteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewHomePage {
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//a[text()=' Logout']") private WebElement LOGout;

	
	
public NewHomePage(WebDriver driver) {

PageFactory.initElements(driver, this);
}

public void UserIdvalidation()
{
	String Actualuserid=UserId.getText();
	
	String ExceptedUserId = "JM6075";
	
	
	if(Actualuserid.equals(ExceptedUserId))
	{
		System.out.println("TC is passed user id matching");
	}
	else {
		System.out.println("TC is  failed user id matching");

	}
	}
	public void clickonlogoutB() throws InterruptedException {
		UserId.click();
		Thread.sleep(1000);
		LOGout.click();
		
	}
		
	
	
		
		
	
		
	}
	


