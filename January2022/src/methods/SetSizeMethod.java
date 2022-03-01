package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(6000);
		Dimension targetSize = new Dimension(800,1200);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(7000);
		driver.quit();
	}
}
