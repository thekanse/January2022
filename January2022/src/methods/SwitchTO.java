package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTO {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("Om Sai", Keys.ENTER);
	driver.quit();
	}
}