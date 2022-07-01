package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void myTest4() {
	  System.out.println("Test method4 is running");
  }
  @Test
  public void test5()
  {
	  Reporter.log(" Test method5 is running ",true);
  }
  @BeforeMethod
  public void loginIn()
  {
	  Reporter.log("Before method is running ",true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After method is running ",true);
  }
  
  
  
}
