package KIteAppPOM;

	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class KiteHomePage2 {
		
		@FindBy(xpath="//span[@class='user-id'") private WebElement UserId;
		

		
		//public  KitehomePage(WebDiver driver) {
	public KiteHomePage2(WebDriver driver) {


			
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
	public String getActualuserID() {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickonlogoutbutton() {
	
		
	}



	}



