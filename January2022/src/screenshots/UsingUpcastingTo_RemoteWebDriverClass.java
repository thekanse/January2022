package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UsingUpcastingTo_RemoteWebDriverClass 
{

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	driver.get("https://www.goole.com");
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/Screen_Shot_No_1.jpeg");
	Files.copy(src, dest);
	
	}

}
