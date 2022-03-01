package readingDataFromXML;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingDataFromXMLFile 
{
WebDriver driver;

	public void openBrowser(String browserValue) 
	{
		if(browserValue.equals("chrome"))
		{
		System.setProperty("webfriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ggoogle.com");
		}
		
		else if(browserValue.equals("firefox"))
		{
		System.setProperty("webfriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ggoogle.com");
		}
		else
		{
			System.out.println("Enter Correct Value");
		}
	}
	
}
