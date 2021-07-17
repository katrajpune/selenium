package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Flipkart1Page {
//declaration
	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")private WebElement UN;
	@FindBy(xpath="//*[@type='password']")private WebElement Pwd;
	@FindBy(xpath="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")private WebElement btn;
	
	//initialization
	
	public Flipkart1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		UN.sendKeys("9403059417");
		
	}
	
public void password() {
		Pwd.sendKeys("Yogesh@07");
		
	}
public void button() {
	btn.click();
	
}
	
}
