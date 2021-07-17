package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomWithDdf2 {

	@FindBy(xpath="//*[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//*[@class='button-orange wide']")private WebElement cntbtn;
	
	public PomWithDdf2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterpin(String pin) {
		Pin.sendKeys(pin);
	}
	
	public void clkctnbtn() {
		cntbtn.click();
	}
	
	
	
}
