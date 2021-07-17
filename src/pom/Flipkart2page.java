package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart2page {

	private static final WebDriver d = null;
	//declaration
	@FindBy(xpath="//*[text()='Yogesh']")private WebElement UID;
	
	//initialization
	public Flipkart2page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	
	  public void userid()
	  {
		  String actid = UID.getText();
		   String exptid = "Yogesh";
		 if(actid.equals(exptid)) {
			 
			 System.out.println("pass");
			 }
		 else {
			 System.out.println("fail");
		 }
	  }
	
	  
		
		
	
}
