package methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPossition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		Point targetPosition = new Point(120, 300);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(8000);
		driver.quit();
	}
}
