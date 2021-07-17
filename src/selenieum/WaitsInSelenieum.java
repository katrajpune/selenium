package selenieum;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenieum {

private static final Function ExpectedConditiion = null;

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id='enable-button']")).click();;
WebDriverWait wait = new WebDriverWait(driver,60);
 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
 driver.findElement(By.xpath("//*[@id='enable-button']")).click();
 driver.findElement(By.xpath("//*[@id='alert']")).click();
 wait.until(ExpectedConditions.alertIsPresent());
 driver.switchTo().alert().accept();
 driver.close();
	
	
	
	
	
	}

}
