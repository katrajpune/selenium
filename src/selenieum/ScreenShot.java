package selenieum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
private static final String Takescreenshot = null;
WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	TakesScreenshot ss = (TakesScreenshot)driver;
	       File source =ss.getScreenshotAs(OutputType.FILE);
	       File destination = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\scr\\google1.jpg");
		FileHandler.copy(source, destination);
	}

}
