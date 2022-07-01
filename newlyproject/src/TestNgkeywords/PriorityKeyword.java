package TestNgkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {
  @Test()
  public void D() {
	  Reporter.log("D id running ",true);
  }
  
  @Test()
  public void H() {
	  Reporter.log("H is running ",true);
  }
  @Test()
  public void A() {
	  Reporter.log(" A is running ",true);
  }
  
}
