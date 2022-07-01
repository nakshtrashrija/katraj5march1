package testNGlistner;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGlistner.Listner1.class)



public class MyTestClass  {
	@Test
	public void MYTESt()
	{
		Assert.fail();
	}
	
	
	
	
  @Test(dependsOnMethods =   {"MYTESt"})
  public void mymethod() {
	 // Assert.fail();
	  Reporter.log("Hi GM",true);
  }
}
