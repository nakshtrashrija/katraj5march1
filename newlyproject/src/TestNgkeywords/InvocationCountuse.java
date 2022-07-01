package TestNgkeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountuse {
  @Test(invocationCount=4)
 
  
  
  public void firstmethod() {
	  Reporter.log("F method is running",true);
	  }
  @AfterMethod
  public void close()
  {
	  Reporter.log("Closing browser ",true);
	  
  }
}
