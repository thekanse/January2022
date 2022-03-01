package pageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 implements IAutoConst
{
static WebDriver driver;
public void openBrowser() throws EncryptedDocumentException, IOException
{
	Flib flib = new Flib();
	String browserValue = flib.readProperty(PROP_PATH, " browser");
	String url = flib.readProperty(PROP_PATH, "url");
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);  
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
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
