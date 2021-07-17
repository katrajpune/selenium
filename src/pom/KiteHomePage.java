package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteHomePage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.5paisa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		KiteLogin1Page lg1 =new KiteLogin1Page(driver);
	lg1.botton();
		lg1.username();
		lg1.pasword();
		Thread.sleep(2000);
		lg1.dateofbirth();
		lg1.loginbtn();
		Thread.sleep(2000);
		 KiteLogin2Page verify =new KiteLogin2Page(driver);
		 verify.icon();
		 verify.verifyuserid();
	
}
}	
	


