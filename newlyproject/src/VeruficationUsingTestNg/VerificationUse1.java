package VeruficationUsingTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerificationUse1 {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
driver.manage().window().maximize();

         WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
//          if (checkbox1.isSelected())
//          {
//        	  Reporter.log("TC is passed",true);
//        	   }
//          else {
//        	  Reporter.log("TC is failed",true);
//          }
                
         
         checkbox1.click();
          Thread.sleep(1000);
          Assert.assertTrue(checkbox1.isSelected(),"cheackbox1 is not selected TC is failed");
        
         
  }
}
