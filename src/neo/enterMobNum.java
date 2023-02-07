package neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class enterMobNum {

	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement enterMNum; 
	@FindBy(xpath="(//a[text()='Sign In'])[2]") private WebElement clickOnsignIn;
	
	public enterMobNum(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	}
	
	public void enterMonnum(String MobNum) throws InterruptedException {
		enterMNum.sendKeys(MobNum);
		Thread.sleep(500);
		Reporter.log("enter mob number is "+MobNum,true);
		clickOnsignIn.click();
		Thread.sleep(500);
		Reporter.log("click on signIn button",true);
	}

}
