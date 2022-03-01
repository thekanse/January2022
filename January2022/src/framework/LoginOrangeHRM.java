package framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHRM 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement un = driver.findElement(By.id("txtUsername"));
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/Testdata.xlsx", "ValidCred", 1, 0);
		String password = flib.readExcelData("./data/Testdata.xlsx", "ValidCred", 1, 1);
		un.sendKeys(username);
		Thread.sleep(3000);
		pwd.sendKeys(password);
		driver.findElement(By.id("btnLogin")).submit();
		
	}

}
