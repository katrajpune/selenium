package selenieum;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SrcShot1 {

private static String filename;

public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	 TakesScreenshot   ssrc = (TakesScreenshot)driver; 
	 File source = ssrc.getScreenshotAs(OutputType.FILE);

	String path=System.getProperty("user.dir")+"\\scrshot\\"+filename+".png";
	File destination = new File(path);
	FileHandler.copy(source,destination);
	
  
	}

	
	}

	

