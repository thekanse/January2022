package keyWordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 
{
static WebDriver driver;
public void openBrowse() throws EncryptedDocumentException, IOException
{
	Flib flib = new Flib();
	String browserValue = flib.readProperty("./data/config.properties", "browser");
	String url = flib.readProperty("./data/config.properties", "url");
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	else
	{
		System.out.println("Enter Corrcet value either 'chrome'/ 'Firfox'");
	}
	
}
public void closeBrowser()
{
	driver.quit();
}

}
