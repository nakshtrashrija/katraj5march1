package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLOGINp {

	
	
	//1.data member/variable
	
	@FindBy(xpath = "//input[@id='userid']")    private  WebElement    userid;
	
	@FindBy(xpath = "//input[@id='password']")   private WebElement password;
	
	@FindBy(xpath = "//button[@class='button-orange wide']")   private   WebElement  login;
	
	//2.constructor
	public KiteLOGINp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.method
	public void senduserid()
	{
		userid.sendKeys("");
	}
	public void sendpassword()
	{
		password.sendKeys("");
	}
	
	public void  clickonlogin()
	{
		 login.click();
	}
	
	
}
