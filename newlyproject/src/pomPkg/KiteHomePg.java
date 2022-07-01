package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePg {
	
	@FindBy(xpath="//span[@class='user-id'") private WebElement UserId;
	

	
	//public  KitehomePage(WebDiver driver) {
public KiteHomePg(WebDriver driver) {


		
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
		System.out.println("TC is passed user id matching");
	}
}



}
