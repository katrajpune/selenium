package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	        WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
	        Thread.sleep(2000);
	        Actions act = new Actions(driver);
	      
	    //   act.dragAndDrop(source,dest).perform();
	        act.moveToElement(source).clickAndHold().
	        moveToElement(dest).release().perform();
driver.close();
}
}
