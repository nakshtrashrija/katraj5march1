package VeruficationUsingTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFlase {
  @Test
  public void Mymethod() {
	  boolean a=true;
	  boolean b=false;
	  Assert.assertTrue(a,"value");
  }
}
