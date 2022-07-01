package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation2 {
  @Test
  public void mymethod() {
	  Reporter.log("Tc is running",true);
  }
}
