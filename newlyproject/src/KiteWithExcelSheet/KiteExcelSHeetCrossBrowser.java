package KiteWithExcelSheet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomPkg.KiteHomePg;
import pomPkg.KiteLOgin1;
import pomPkg.KitePinPage1;

public class KiteExcelSHeetCrossBrowser {
	KiteLOgin1 login;
	KiteHomePg home;
	KitePinPage1 pin;
	WebDriver driver;
     // sheet sheet;
	private Object mySheet;
	
	
	@Parameters("browser")
	@BeforeMethod
	
	
	public void launchBarowser(String browser) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
	if (browser.equals("chrome"))
	{
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\selenium-java-4.1.3\\lib\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	else if(browser.equals("firefox"))
	{
		
	  System.setProperty("webdriver.gecko.driver","E:\\selenium\\-java-4.1.3\\lib\\geckodriver.exe");
	 driver =new FirefoxDriver();
		 }
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching url",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login=new KiteLOgin1(driver);
	home=new KiteHomePg(driver);
	pin=new KitePinPage1(driver);
	
	File Myfile=new File("E:\\new excel\\read Excel Worksheet.xlsx");
	 mySheet = WorkbookFactory.create(Myfile).getSheet("sheet1");
	 login=new KiteLOgin1(driver);
	 pin=new KitePinPage1(driver);
	 home=new KiteHomePg(driver);
	
	}
	@BeforeMethod
	public void KiteLOgin1()
	{
		//login.sendUserName(she);
		
	}
	

		 
		 
	}

