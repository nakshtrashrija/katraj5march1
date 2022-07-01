package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLOgin1 {
	
	//1.variable/data member
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	
	
	@FindBy(xpath = "//input[@id='password']")  private WebElement PASS;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement BUTTON;
	
	
	 {
		// TODO Auto-generated constructor stub
	}
	//2.constructor
	public KiteLOgin1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//3.methods
	public void sendUserName(String username)
	{
		UN.sendKeys( username);
	}
	public void sendPassword(String pwd)
	{
		PASS.sendKeys(pwd);
		
	}
	public void clickonloginbutton()
	{
		BUTTON.click();
	}
	

}
