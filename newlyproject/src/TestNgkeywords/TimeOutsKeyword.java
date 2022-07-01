package TestNgkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutsKeyword {
  @Test(timeOut = 1000)
  public void Tc1() throws InterruptedException {
	  Thread.sleep(1200);
	  Reporter.log("TC is running",true);
  }
  @Test()
  public void TC2() throws InterruptedException
  {
	  
	  Reporter.log("TC2 is running",true);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("TC3 is running",true);
  }
  @Test
  public void TC4()
  {
	  Reporter.log("TC4 is running ",true);
  }
}
