package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodhalogin {


	//1. data member/variable
	@FindBy(xpath="//input[@id='userid']") private WebElement UserId;
	
	@FindBy(xpath="//input[@id='password']") private WebElement  Password;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginButton;
	
	//2.constructor
	 
	public  KiteZerodhalogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserId()
	{
		UserId.sendKeys("JM6075");
	}
	
	public void Password()
	{
		Password.sendKeys("Shri@123");
	}
	public void loginButton()
	{
		loginButton.click();
	}
}