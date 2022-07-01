package VeruficationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNULL {
  @Test
  public void MyRupee() {
	  
	  
	  String s=null;
	  String m="paisa";
	  
	//  Assert.assertNotNull("m value is Null TC is failed");
	 // Reporter.log("value is not null TC is PASSED",true);
	  
	  
	  Assert.assertNull(s,"value is not Null TC failed");
	  Reporter.log("value is null TC is PASSED",true);
  }
}
