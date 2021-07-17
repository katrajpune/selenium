package action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDataFromExcelSheet {


public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\exceldata.xlsx");
	XSSFWorkbook fis = new XSSFWorkbook(file);
	XSSFSheet sh = fis.getSheetAt(0);
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
WebDriver driver = new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//un
	String un = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(un);
//pw
String pw = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pw);


driver.findElement(By.xpath("//*[@type='submit']")).click();
//pin

String pin = sh.getRow(0).getCell(2).getStringCellValue();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='pin']")).sendKeys(pin);


driver.findElement(By.xpath("//*[@class='button-orange wide']")).click();












}
}
