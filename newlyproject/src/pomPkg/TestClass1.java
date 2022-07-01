package pomPkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File Myfile = new File("D:\\reading excels1.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("sheet3");
		String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		KiteLOgin1 login=new KiteLOgin1(driver);
		login.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendPassword(pwd);
		login.clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage1 pin1=new KitePinPage1(driver);
		pin1.sendpin(pin);
		pin1.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		// Kite1WithExcelSheet home= new Kite1WithExcelSheet(driver);
		 
		
		
		
		
		
		
		
	   
		
		
		

	

	}

}
