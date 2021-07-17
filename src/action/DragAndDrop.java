package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/drag-drop");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
WebElement src = driver.findElement(By.xpath("//div[@class='box navy']"));
WebElement dest = driver.findElement(By.xpath("//div[@id='destination']"));
Thread.sleep(2000);
act.moveToElement(src).clickAndHold().perform();
act.moveToElement(dest).release().perform();




}
}
