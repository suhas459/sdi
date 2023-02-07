package neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class homePage {
@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signIn;
	
	public homePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
	
	public void clickOnSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
		Reporter.log("click on signIn Button", true);
	}
}
