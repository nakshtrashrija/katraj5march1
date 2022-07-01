package xmlStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelStudy {
	 @Test
	  public void mymethod1() {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://vctcpune.com/");
			System.out.println("my method1 is running");
			
			driver.manage().window().maximize();
	  }
	  
			@Test
			  public void mymethod2() {
				  
				  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.mysql.com/");
					Reporter.log("my method2 is running");
					
					driver.manage().window().maximize();
			}
					@Test
					  public void mymethod3() {
						  
						  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
							WebDriver driver = new ChromeDriver();
							
							driver.get("https://kite.zerodha.com/");
							Reporter.log("my method3 is running",true);
							
							driver.manage().window().maximize();
						
	  }
	  
}
