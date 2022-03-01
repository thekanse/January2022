package takeScreenShotDynamically;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	
	static WebDriver driver;
	public static void initialization() 
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	}
		
	public void failed() 
	{
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/FailedScreenshot.png");
		Files.copy(src, dest);
	     
	}
	catch(Exception e)
	{
		
	}
		
	}
	
}