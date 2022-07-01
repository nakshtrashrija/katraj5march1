
package KIteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogINpagepom {
	//1.variable/data member
	
		@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
		
		
		@FindBy(xpath = "//input[@id='password']")  private WebElement PASS;
		
		@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement BUTTON;
		
		
		 {
			
		}
		//2.constructor
		public KiteLogINpagepom (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		
		//3.methods
		public void sendUserName(String username)
		{
			UN.sendKeys( "username");
		}
		public void sendPassword(String pwd)
		{
			PASS.sendKeys("Shri@123");
			
		}
		public void clickonloginbutton()
		{
			BUTTON.click();
		}
		

	}



