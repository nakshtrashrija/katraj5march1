package KIteBASEclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KiteAPPUtility.UtilityUsingPropertyFile;

public class BaseClassUsingProperty {
	
	
protected static WebDriver driver;//browser set up

public void openBrowser() throws IOException
{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityUsingPropertyFile.readDataFromUtilityUsingProperty("URL"));
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}




}
