package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite1WithExcelSheet {
//1.variables/data members
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	@FindBy(xpath = "//a[@target='_self']")private  WebElement LOGOUTBUTTON;
	
	
	//2.constructor
	public Kite1WithExcelSheet(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void validUserId(String exceptedusername)
	{
		String actualuserID=userID.getText();
		String excepteduserID=exceptedusername;
		  
		
		if(actualuserID.equals(excepteduserID))
		{
			System.out.println("USER ID matching TC pass");
		}
		else {
			System.out.println("USER ID  not matching TC fail");
		}
		
		}
	public void clickonlogoutbutton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(1000);
		 LOGOUTBUTTON.click();
	
	}
	
	
}
