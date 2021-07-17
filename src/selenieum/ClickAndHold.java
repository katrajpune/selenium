package selenieum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
 

		
//			
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
//	ChromeDriver d = new ChromeDriver();
//	d.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
//	
//	WebElement ch =d.findElementByClassName(("//*[@class='ui-state-default']"));
//	Actions act=new Actions(d);
//	WebElement b=d.findElementByClassName(("//*[@class='ui-state-default'][2]"));
//	act.clickAndHold(ch).moveToElement(b).build().perform();
//	
//
//	act.clickAndHold(ch).moveToElement(b).build().perform();
//	Thread.sleep(2000);
//	act.release(b).perform();
//	
			public static void main(String[] args)throws InterruptedException
			{
    ChromeDriver driver= new ChromeDriver();

			driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");	
		Actions act = new Actions(driver);

	WebElement letterc = driver.findElement(By.xpath("//li[@name='C']"));



	WebElement letterh = driver.findElement(By.xpath("//li[@name='H']"));	


	act.clickAndHold(letterc).moveToElement(letterh).build().perform();

	Thread.sleep(2000);


	act.release(letterh).perform();

		}}

	
		
		
		
	
	
	
	
	

	

		
		
