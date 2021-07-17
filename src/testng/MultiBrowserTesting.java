package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	
	@Parameters("broswerName")
	@Test
	public void TC(String browserName)
	{
		WebDriver driver = null;
		if(browserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenieumbasic\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\selenieumbasic\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://kite.zerodha.com/");
			//driver.manage().window().maximize();
			
	}}
