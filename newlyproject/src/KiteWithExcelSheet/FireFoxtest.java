package KiteWithExcelSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxtest {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.gecko.driver","E:\\selenium\\selenium-java-4.1.3\\lib\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			driver.get("https://kite.zerodha.com");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			

	}

}
