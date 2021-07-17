package testngdisscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest
{
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@title='English (UK)']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		 WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		 Actions act = new Actions(driver);
		 //Thread.sleep(2000);
		 act.click(month).sendKeys(Keys.ARROW_DOWN).build().perform();
		
	}

	
	
	
	
	
	
}
