package keyWordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{ 
static WebDriver driver;

public void openBrowser() throws EncryptedDocumentException, IOException
{
	Flib flib = new Flib();
	String browserValue = flib.readProperty("./data/congig.properties", "browser");
	String url = flib.readProperty("./data/congig.properties", "url");
	
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
	
	}
	else 
	{
		System.out.println("please enter correct value either 'Chrome'/ 'firefox'");
	}
	
}

public void closeBrowser()
{
	driver.quit();
}


}
