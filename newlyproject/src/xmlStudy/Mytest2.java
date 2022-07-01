package xmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest2 {
  @Test(groups = "sanity")
  public void mymethod () {
	  Reporter.log("sanity is running");
  }
  @Test
  public void mymethodl() {
	  Assert.fail();
	  Reporter.log("Method is running ",true);
	   }
  @Test
  public void mymethodm() {
	  Reporter.log("Method is running ",true);
  }
  @Test(groups = "regression")
  public void mymethodn() {
	  Reporter.log("regression is running ",true);
  }
  @Test
  public void mymethodo()
  {
	  Assert.fail();
	  Reporter.log("Method is running ",true);
  }

}
