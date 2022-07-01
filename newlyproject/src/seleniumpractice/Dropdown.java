package seleniumpractice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
	Thread.sleep(1000);
	WebElement day = driver.findElement(By.name("birthday_day"));
	Thread.sleep(1000);
	
	Select s=new Select(day);
	Thread.sleep(1000);
	
	//s.selectByIndex(10);
	//Thread.sleep(1000);
	s.selectByValue("9");
	Thread.sleep(1000);
	s.selectByVisibleText("nov");
	WebElement month = driver.findElement(By.id("month"));
	
	Select s1=new Select(month);
	s1.selectByVisibleText("dec");
	s1.selectByValue("3;");
	s1.selectByIndex(8);
	
	
	
		
		

	}

}
