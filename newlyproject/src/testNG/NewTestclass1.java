package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestclass1 {
  @Test
  public void test() {
	  Reporter.log("test method running ",true);
	  
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before method1 running ",true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("test method2 is running ",true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After method is running ",true);
  }
}
