package selenieum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownKey {
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	driver.manage().window().maximize();
	

WebElement ind = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
ind.sendKeys("india");
Thread.sleep(5000);
Actions act = new Actions(driver);
act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();




}
	
	}