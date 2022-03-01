package avoidDuplicatesValue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avoid_Duplicates_Using_HashSet_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Krishna%20Kanse/Desktop/WebElement/multiSelectDropdown.html");
		Thread.sleep(5000);
		
		

	}

}
