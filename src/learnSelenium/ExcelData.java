package learnSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	
	
	
	@Test
	public void data() throws IOException 
	{
		//File src=new File("E:\\ppt\\Book3.xlsx");
		//Load the data in background
		String path="C:\\Users\\LENOVO\\Documents\\ReadData.xlsx";;
		FileInputStream fis=new FileInputStream(path);
	
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		String data=sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
	}
	
	

}
