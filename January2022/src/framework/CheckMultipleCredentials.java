package framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMultipleCredentials 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement un = driver.findElement(By.id("txtUsername"));
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		WebElement LgnBtn = driver.findElement(By.id("btnLogin"));
		Flib flib = new Flib();
		int LRC = flib.LastRowCount("./data/Testdata.xlsx", "InvalidCred");
		for(int i=1;i<=LRC;i++)
		{
			String username = flib.readExcelData("./data/Testdata.xlsx", "InvalidCred", i, 0);
			String password = flib.readExcelData("./data/Testdata.xlsx", "InvalidCred", i, 1);
			un.sendKeys(username);
			Thread.sleep(2000);
			pwd.sendKeys(password);
			Thread.sleep(2000);
			LgnBtn.submit();
			un.clear();
		}

	}

}
