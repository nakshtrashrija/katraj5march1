package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage1 {
	//1.data member
	
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	
	@FindBy(xpath = "//button[@class='button-orange wide']")  private WebElement CBUTTON;
	
	//2.constructor
	public KitePinPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickoncontinuebutton()
	{
		CBUTTON.click();
	}
	
	
	

}
