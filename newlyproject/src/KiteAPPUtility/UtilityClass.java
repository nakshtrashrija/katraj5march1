package KiteAPPUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass {
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File MYFile= new File("E:\\new excel\\read Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(MYFile).getSheet("sheet1");
		String myValue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return myValue;
		}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		
		File dest=new File("D:\\sa"+random+".png");
		FileHandler.copy(src, dest);
	}

}
