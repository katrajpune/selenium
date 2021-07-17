package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asus max m2");
	driver.findElement(By.xpath("//*[@class='_34RNph']")).click();
	String price = driver.findElement(By.xpath("((//*[@class='_2kHMtA'])[1]//div)[17]")).getText();
	
System.out.println(price);
	
	
	
	
	
	
}
}
