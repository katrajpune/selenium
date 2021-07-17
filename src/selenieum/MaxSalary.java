package selenieum;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MaxSalary {
  public static void main(String[] args) throws IOException {
	
	  String path= System.getProperty("C:\\Users\\Admin\\OneDrive\\Desktop\\exceldata\\Book1.xlsx");
	  
	File src = new File(path);
	FileInputStream fis = new FileInputStream(src);
XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet yg = wb.getSheetAt(0);
	
	String value= yg.getRow(2).getCell(1).getStringCellValue();
	System.out.println(value);
}}