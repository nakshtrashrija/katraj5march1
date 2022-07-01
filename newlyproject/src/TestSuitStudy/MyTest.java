package TestSuitStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void This() {
	  Reporter.log("This is running ",true);
  }
  @Test
  public void Show()
  {
	  Reporter.log("Show is running ",true);
  }
}











