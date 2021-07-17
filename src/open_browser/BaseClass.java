package open_browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	static WebDriver driver;
		
	@BeforeSuite
	public void openbrowser()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
	
driver=new ChromeDriver();
driver.get("https://www.5paisa.com/");
driver.manage().window().maximize();
	}
//@AfterSuite
//
//public void quitbrowser() {
//driver.close();
}
