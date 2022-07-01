package KIteAppPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomPkg.KiteHomePg;
import pomPkg.KitePinPage1;
import pomPkg.KiteZerodhalogin;

public class NewtestClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		options.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver( options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		NewLOGINpage login=new  NewLOGINpage (driver);
		 login.sendUserName();
		 login.sendPassword();
		 login.clickonloginbutton();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 
		 
		 NewPINPage pin =new NewPINPage(driver);
		 pin.clickoncontinuebutton();
		 
		 NewHomePage Home=new NewHomePage(driver);
		 Home.UserIdvalidation();
		 Home.clickonlogoutB();
		 
		
	}

	}


