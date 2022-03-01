package handelingTheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCredentialFromExcelAndLoginActiTime 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=efnfecqm2j6mc");
	
	WebElement usn = driver.findElement(By.name("username"));
	WebElement pass=driver.findElement(By.name("pwd"));
	WebElement login = driver.findElement(By.id("loginButton"));
	
	Flib flib=new Flib();
	String username = flib.readExcelData("./data/TestData.xlsx", "ActiValidCred", 1, 0);
	String password = flib.readExcelData("./data/TestData.xlsx", "ActiValidCred", 1, 1);
	
	usn.sendKeys(username);
	Thread.sleep(3000);
	pass.sendKeys(password);
	Thread.sleep(3000);
	login.click();
	Thread.sleep(10000);
	driver.quit();
	}
}
