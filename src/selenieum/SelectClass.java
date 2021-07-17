package selenieum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
WebDriver username =null;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		d.findElement(By.id("txtPassword")).sendKeys("admin123");
	d.findElement(By.id("btnLogin")).click();
	d.findElement(By.id("menu_leave_viewLeaveModule")).click();
	d.findElement(By.id("calFromDate")).click();
	WebElement month=
	d.findElement(By.id("ui-datepicker-month"));
	Select sel = new Select(month);
	Thread.sleep(2000);
	sel.selectByVisibleText("jan");
	((WebElement) d).click();
	
	
	
	

	
		
		
	}


	
	}


	

	
	

