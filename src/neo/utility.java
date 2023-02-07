package neo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility {
	   //excel
		//screenshot
		//wait
		//ScrollIntoView
		
		//excel sheet reading
	
	public  static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException {
		
		File f= new File("C:\\Users\\SUHAS\\Desktop\\excel\\java.xlsx");
		Sheet mySheet = WorkbookFactory.create(f).getSheet("Sheet4");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("read data of  "+mySheet+"row is  "+row+" & cell is"+cell,true);
		Reporter.log("the data is  "+value);
		return value;
		
	}
	
	//implicit wait 
	
	public static void implicitWait(WebDriver driver,int time) {
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("apply wait is  "+time + " ms", true);
		
	}
		
	//ScrollIntoView 
	//
	public  static void scroll(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		 
		Reporter.log("to scroll that element "+element.getText());
		
	}
		
	//takesScreenShot
	public static void screenShot(WebDriver driver,String names) throws IOException {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\New folder"+names+".png");
		FileHandler.copy(scr, dest);
		
		Reporter.log("taken screenshot",true);
		Reporter.log("screenshot is taken & saved at "+ dest,true);
		
		}
}