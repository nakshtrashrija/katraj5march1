package TestNgkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
  @Test(priority = -2)
  public void Anu() {
	  Reporter.log("Annu is running ",true);
  }
  @Test(priority = 3)
  public void Dimple()
  {
	  Reporter.log("Dimple is running ",true);
  }
  @Test(priority = 1)
  public void Shri()
  {
	  Reporter.log("Shri is running " ,true);
  }
  
  @Test(priority = -2)
  public void Nakshtra()
  
  {
	  Reporter.log("Nakshter is running",true);
  }
}
