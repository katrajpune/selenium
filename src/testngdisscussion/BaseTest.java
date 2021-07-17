package testngdisscussion;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
	@BeforeSuite
	public void browserlogin(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
	@Test
	public void test1() {
		Reporter.log("testone",true);
	}
	@AfterSuite
	public void quitbrowser() {
		driver.quit();
	}
	
	
	
}
