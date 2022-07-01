package KiteAppTestClass;

import java.io.IOException;

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
import KIteBASEclass.BaseClassUsingProperty;
import KiteAPPUtility.UtilityUsingPropertyFile;

public class KiteUsingPropertytestClass extends BaseClassUsingProperty{
	KiteLogINpagepom login;
	KitePInPAge2 pin; 
	KiteHomePage2 home;//calling from pom class not creating again pom
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login= new KiteLogINpagepom(driver);
		pin= new KitePInPAge2(driver);
		home=new KiteHomePage2(driver);
	}
	@BeforeMethod
	public void logINtoKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile.readDataFromUtilityUsingProperty("UN"));
		login.sendPassword(UtilityUsingPropertyFile.readDataFromUtilityUsingProperty("PWD"));
		login.clickonloginbutton();
		UtilityUsingPropertyFile.implicitWait(driver, 400);
		pin.sendpin(UtilityUsingPropertyFile.readDataFromUtilityUsingProperty("PIN"));
		pin.clickoncontinuebutton();
	}
	
	
  @Test
  public void validateUserName() throws IOException {
	 String actualuserid = home.getActualuserID();
	 String exceptedUserId = UtilityUsingPropertyFile.readDataFromUtilityUsingProperty("UN");
	 
	 Assert.assertEquals(actualuserid, exceptedUserId,"Actual and Excepted not matching,TC is Failed");
	 Reporter.log("Actual and Excepted are matching,TC is Passed",true);
	 UtilityUsingPropertyFile.takeScreenshot(driver);
  }
  @AfterMethod
  public void logoutFromkite() {
	  home.clickonlogoutbutton();
	   }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(9000);
	  driver.close();
  }
}
