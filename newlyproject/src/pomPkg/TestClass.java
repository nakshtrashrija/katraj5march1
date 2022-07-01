package pomPkg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestClass {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver( options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		 KiteZerodhalogin login=new  KiteZerodhalogin (driver);
		 login.Password();
		 login.loginButton();
		 login.sendUserId();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 KiteHomePg Home=new KiteHomePg(driver);
		 Home.UserIdvalidation();
		 
		KitePinPage1 pin =new KitePinPage1(driver);
		 pin.clickoncontinuebutton();
		
	}



	}


