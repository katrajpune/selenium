package selenieum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenieum {
		
			
		
		WebDriver username=null;

			public static void main(String[] args)throws InterruptedException
			{
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("admin");
		
		

    
      d.findElement(By.id("txtPassword"))
		.sendKeys("admin123");
     d.findElement(By.id("btnLogin")).click();

     
     d.findElement(By.id("welcome")).click();
     Thread.sleep(2000);
d.findElement(By.linkText("Logout")).click();
                     d.close();

			}}

			
			
		

