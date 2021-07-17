package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	//declaration
	@FindBy(xpath="//*[contains(text(),'log in')]")private WebElement btn;
	@FindBy(xpath="//*[@class='input-field ']") private WebElement UN;	
	
	@FindBy(xpath="//*[@id='loginPwd']")private WebElement Pwd;
	
	@FindBy(xpath="//*[@class='input-field']")private WebElement dob;
	@FindBy(xpath="//*[@id='LoginSubmit']")private WebElement login;
//initialization
	public void botton()
	{
		btn.click();
	}
	
	public void username()
	{
		UN.sendKeys("58272973");
	}
	public void pasword()
	{
	Pwd.sendKeys("Arnav@2019");	
	}

	public void dateofbirth() {
		dob.sendKeys("07111991");
	}
	public void loginbtn()
	{
		login.click();
	}
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
