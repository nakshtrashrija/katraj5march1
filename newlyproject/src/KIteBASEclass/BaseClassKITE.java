package KIteBASEclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassKITE {
	
	protected  static WebDriver driver;//browser setup
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
