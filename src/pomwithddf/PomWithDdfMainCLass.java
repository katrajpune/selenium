package pomwithddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.base.Verify;

public class PomWithDdfMainCLass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenieumbasic\\TestData\\exceldata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		         XSSFSheet sh = wb.getSheetAt(0);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenieumbasic\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		 PomWithDdf1 lg1 =new PomWithDdf1(driver);
		  String UN = sh.getRow(0).getCell(0).getStringCellValue();
		 lg1.enterUN(UN);
		 String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		 lg1.enterPwd(pwd);
		 Thread.sleep(2000);
		 lg1.lgnbtn();
		 PomWithDdf2 lg2= new PomWithDdf2(driver);
		 Thread.sleep(2000);
		 String pin = sh.getRow(0).getCell(2).getStringCellValue();
		lg2.enterpin(pin);
		lg2.clkctnbtn();
		
		PomWithDdf3 fy = new PomWithDdf3(driver);
		String uid = sh.getRow(0).getCell(3).getStringCellValue();
		Thread.sleep(2000);
		fy.verifyID(uid);
		
		
		
	}

}
