package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Flipkart1Page lg1= new Flipkart1Page(driver);
	lg1.username();
	lg1.password();
	Thread.sleep(2000);
	lg1.button();
	Thread.sleep(2000);
	Flipkart2page lg2= new Flipkart2page(driver);
	lg2.userid();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
