package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
  @Test(groups = "regression")
  public void g () {
  }
  public void mymethoda() {
	  Reporter.log("Method is running ",true);
	   }
  @Test
  public void mymethodb() {
	  Reporter.log("Method is running ",true);
  }
  @Test(groups = "sanity")
  public void mymethodc() {
	  Reporter.log("Method is running ",true);
  }
  @Test
  public void mymethodf()
  {
	  Reporter.log("Method is running ",true);
  }

}
