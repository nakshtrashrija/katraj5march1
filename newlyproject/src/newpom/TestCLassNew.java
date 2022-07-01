package newpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCLassNew {

	public static void main(String[] args) {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver( );
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		LOgin log=new LOgin(driver);
		log.SendUserName();
		log.PassWord();
		log.clickonLogIN();
	}
				
	}


