package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider 
{
	XSSFWorkbook book;
	XSSFSheet sheet;
	
	public ExceldataProvider() throws IOException
	{
		try
		{
			File file1 = new File("./ApplicationTestData");
			FileInputStream fs = new FileInputStream(file1);
			book = new XSSFWorkbook(fs);
			
		} 
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getData(int sheetno, int row, int col)
	{
		sheet= book.getSheetAt(sheetno);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data ;
	}
	public String getData(String sheetname, int row, int col){
		sheet= book.getSheet(sheetname);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data ;
	}

}
