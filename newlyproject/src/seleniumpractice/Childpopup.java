package seleniumpractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String idOfMainpage = driver.getWindowHandle();
		System.out.println("Main page id "+ idOfMainpage);// Id of main page// it gives return type string
		
		Set<String> allids = driver.getWindowHandles();//set need to convert into ArrayList
		ArrayList<String> ar = new  ArrayList<>	(allids);
		for(int i=0; i<=ar.size()-1;i++) {
			System.out.println(ar.get(i));//to switch to child page

		}
	}

}
