package KIteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLOGINpage {
	
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	
	
	@FindBy(xpath = "//input[@id='password']")  private WebElement PASS;
	
	//@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement BUTTON;
	
	
	public NewLOGINpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//3.methods
	public void sendUserName( )
	{
		UN.sendKeys( "JM6075");
	}
	public void sendPassword()
	{
		PASS.sendKeys("Shri@123");
		
	}
	public void clickonloginbutton()
	{
		BUTTON.click();
	}
	

}
