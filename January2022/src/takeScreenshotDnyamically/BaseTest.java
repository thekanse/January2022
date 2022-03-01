package takeScreenshotDnyamically;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseTest 
{
static WebDriver driver;
public static void initialization()
{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://127.0.0.1/login.do;jsessionid=oyek518gy8du");
}

public void failed(String methodName)
{
	try
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+methodName+".png");
		Files.copy(src, dest);
	}
	catch(Exception e)
	{
		
	}
}
}
