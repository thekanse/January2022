package handelingTheExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTheRowCount 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//Specify the excel path
		Workbook wb = WorkbookFactory.create(fis);//create() it used to make ready excel file for read.
		Sheet sh = wb.getSheet("Cities");//specify the sheet name 
		int rowCount = sh.getLastRowNum();//specify to get last count of the cell 
		System.out.println(rowCount);

	}

}
