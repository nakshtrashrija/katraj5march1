package TestNgkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywordsUsing {
  @Test
  public void A() {
	  Reporter.log("A is running ",true);
  }
  @Test(priority = -2,timeOut = 1000,enabled = true, dependsOnMethods = {"A"} )
  public void B()
  {
	  Reporter.log("B is running",true);
  }
  @Test(enabled = false)
  public void C()
  {
	  Reporter.log("C is running",true);
  }
}
