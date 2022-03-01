package handelingTheExcelFile;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ReadAllTheRows 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	Flib flib = new Flib();
	int rc = flib.readRowCount("./data/TestData.xlsx", "Cities");
	
	for(int i=1; i<rc;i++)
		{
		String cities = flib.readExcelData("./data/TestData.xlsx", "Cities", i, 0);
		System.out.println(cities);
		Thread.sleep(2000);
		}
	}
	
	}
