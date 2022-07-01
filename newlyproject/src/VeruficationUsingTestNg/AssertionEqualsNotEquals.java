package VeruficationUsingTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionEqualsNotEquals {
  @Test
  public void f() {
	  
	  String s="Dimple";
	  String m="Velocity";
	  String n="pune";
	  
	  //2.if s and m are same than TC should be passed elseTc failed
	 // Assert.assertEquals(m,s, "String are not matching TC Failed");
	 // Reporter.log("Strings are matching TC passed",true);
	  
	  
	  //3.Assert not equals
	  Assert.assertNotEquals(m,s, "String are matching TC is failed ");
	  Reporter.log("String are not matching TC is passed",true);
	  
  }
}
