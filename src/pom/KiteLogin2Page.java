package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	@FindBy(xpath="//*[@class='trade-icon trade-icon--user']") private WebElement icon;
	@FindBy(xpath="//*[text()='58272973']")private WebElement id;
	
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void icon() {
	icon.click();
	
}
public void verifyuserid() {
	
	String actid = id.getText();
	 String exptid = "58272873";
if(actid.equals(exptid))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}


}
