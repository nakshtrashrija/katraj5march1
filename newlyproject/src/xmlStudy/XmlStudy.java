package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class XmlStudy {
	//i want 1,3,5 i dont want 2,4
  @Test
  public void mymethod1() {
	  Reporter.log("Method is running ",true);
	   }
  @Test
  public void mymethod2() {
	  Reporter.log("Method is running ",true);
  }
  @Test
  public void mymethod3() {
	  Reporter.log("Method is running ",true);
  }
  @Test
  public void mymethod4()
  {
	  Reporter.log("Method is running ",true);
  }
}
