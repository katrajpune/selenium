package pomwithddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomWithDdf3 {
@FindBy(xpath="//*[text()='DV1510']")private WebElement userid;


public PomWithDdf3(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void verifyID(String expuserId) {
	
		String actUserid = userid.getText();
		if(actUserid.equals(expuserId)) {
			System.out.println("pass");
		}
		else {
			
		
	System.out.println("fail");}

	}
	
}
	
	

	
