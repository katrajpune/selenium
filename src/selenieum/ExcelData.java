package selenieum;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\Exceldata\\exceldata.xlsx";
		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook sv = new XSSFWorkbook(fis);
		
		XSSFSheet niki = sv.getSheetAt(0);
		String value = niki.getRow(4).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
	}}
		
		
		
		
		
		
				
			
				
		
		
		
		
		
		
		
	
