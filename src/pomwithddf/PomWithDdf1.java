package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomWithDdf1 {
//declaration
	@FindBy(xpath="//*[@id='userid']")private WebElement UN;
	@FindBy(xpath="//*[@id='password']")private WebElement	Pwd;
	@FindBy(xpath="//*[@class='button-orange wide']")private WebElement btn;
	
	//initialization
	
	public PomWithDdf1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

//usage
	public void enterUN(String username) {
		UN.sendKeys(username);
	}


public void enterPwd(String password) {
		Pwd.sendKeys(password);
	}
public void lgnbtn() {
	btn.click();;
}
}
