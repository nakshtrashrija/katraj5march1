package TestNgkeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnkey {
  @Test(priority = 1)
  public void me() {
	 // Assert.fail();
	  Reporter.log("Me is running",true);
  }
  @Test(priority = 2)
  public void you()
  {
	  Reporter.log("You is running ",true);
  }
  @Test(dependsOnMethods = "me")
  public void hum()
  {
	  Reporter.log("Hum is running ",true);
  }
}
