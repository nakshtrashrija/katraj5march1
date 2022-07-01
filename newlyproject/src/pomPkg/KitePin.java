package pomPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KitePin {
	//1. data member/variable
	
		@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
		
		@FindBy(xpath="//button[@type='submit']") private WebElement submit;
		
		public void Pin()
		{
			Pin.sendKeys("098150");
		}
		public void submit()
		{
			submit.click();
		}
	
	
	
	
	
	

}
