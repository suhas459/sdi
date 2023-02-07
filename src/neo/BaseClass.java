package neo;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class BaseClass {
public  WebDriver driver;
	
	public   void luanchBrowser() throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\"
					+ "chromedriver_win32\\"
					+ "chromedriver.exe");

			 
		    driver = new ChromeDriver();
			driver.navigate().to("https://neostox.com/");
			Reporter.log("launch the neostox launch", true);
			//Thread.sleep(2000);
		utility.implicitWait(driver, 1000);
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f= new File("D:\\java\\sc\\i.png");
		
		
		
			}
	}
