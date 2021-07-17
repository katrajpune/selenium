package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1RightClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
String title = driver.getTitle();
driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
  boolean lgnbtn = driver.findElement(By.xpath("//*[contains(text(),'Login')]")).isEnabled();
  System.out.println(lgnbtn);

Actions act = new Actions(driver);
Thread.sleep(2000);
//act.moveToElement(lgnbtn).perform();
//act.contextClick(lgnbtn).perform();


System.out.println(title);

String url = driver.getCurrentUrl();


System.out.println(url);
}
}
