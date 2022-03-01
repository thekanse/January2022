package handelingTheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidTC 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=215jom75t0qgp");
	
	Flib flib =new Flib();
	int rc = flib.readRowCount("./data/TestData.xlsx", "ActiInValidCred");
	
	for(int i=1;i<rc;i++)
	{
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		
		String username = flib.readExcelData("./data/TestData.xlsx", "ActiInValidCred", i, 0);
		String password = flib.readExcelData("./data/TestData.xlsx", "ActiInValidCred", i, 1);
		
		usn.sendKeys(username);
		pass.sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("loginButton")).click();
		driver.navigate().refresh();
		driver.findElement(By.name("username")).clear();
	}
	}	
	}

