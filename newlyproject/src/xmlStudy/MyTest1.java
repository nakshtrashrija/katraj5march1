package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void A() {
	  Reporter.log("A is running",true);
  }
  public void mymethod5() {
	  Reporter.log("Method is running ",true);
	   }
  @Test
  public void mymethod6() {
	  Reporter.log("Method is running ",true);
  }
  @Test
  public void mymethod7() {
	  Reporter.log("Method is running ",true);
  }
  @Test
  public void mymethod8()
  {
	  Reporter.log("Method is running ",true);
  }
}
