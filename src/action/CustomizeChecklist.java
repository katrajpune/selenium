package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizeChecklist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@title='English (UK)']")).click();
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

 WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
 Actions act = new Actions(driver);
 Thread.sleep(2000);
 act.click(month).sendKeys(Keys.ARROW_DOWN).build().perform();



	}

}
