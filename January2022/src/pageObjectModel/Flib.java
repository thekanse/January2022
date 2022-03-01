package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{

// To red the data from Excel File
	public String readExcelData(String ExcelPath, String Sheetname, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream(ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(Sheetname);
	Row row = sh.getRow(rowCount);
	Cell cell = row.getCell(cellCount);
	String value = cell.getStringCellValue();
	return value;
	}
	
	public int LastRowCount(String ExcelPath, String Sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		int lastRowCount = sh.getLastRowNum();
		return lastRowCount;
	}
	
	public void writeExcelData(String ExcelPath, String Sheetname, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(ExcelPath);
		wb.write(fos);
	}
	
	public String readProperty(String propPth, String key) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(propPth);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}
	
}
