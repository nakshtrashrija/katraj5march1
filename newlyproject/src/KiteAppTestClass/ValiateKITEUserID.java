package KiteAppTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KIteAppPOM.KiteHomePage2;
import KIteAppPOM.KiteLogINpagepom;
import KIteAppPOM.KitePInPAge2;
import KIteBASEclass.BaseClassKITE;
import KiteAPPUtility.UtilityClass;

public class ValiateKITEUserID extends BaseClassKITE{
	KiteLogINpagepom login;
	KiteHomePage2 home;
	KitePInPAge2 pin;
	//WebDriver driver;
	
	@BeforeClass
	
	public void launchBrowser()
	{
		openBrowser();
		
		login= new KiteLogINpagepom(driver);
		home= new KiteHomePage2(driver);
		pin=new KitePInPAge2(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(UtilityClass.readDataFromExcel(0, 0));
	login.sendPassword(UtilityClass.readDataFromExcel(0, 1));
	login.clickonloginbutton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
	pin.sendpin(UtilityClass.readDataFromExcel(0, 2));
	pin.clickoncontinuebutton();
	
	}
  @Test
  public void ValidateUserName() throws EncryptedDocumentException, IOException {
	  String actualUserName=home.getActualuserID();
	  String exceptedUserName = UtilityClass.readDataFromExcel(0, 0);
	  
	  
	  Assert.assertEquals(actualUserName,exceptedUserName,"TCis FAILED actual and excepted username not matching" );
	  Reporter.log("usernames are matching TC is passed",true);
	  UtilityClass.takeScreenshot(driver);
	  
  }
  
 @AfterMethod
 public void logoutfromKiteApp()
 {
	 home.clickonlogoutbutton();
	 
 }
 @AfterClass
 public void closeBrowser()
 {
	 driver.close();
 }
 
}
