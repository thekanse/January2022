package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MaximizeMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
//		Options man = driver.manage();
//		Window win = man.window();
//		win.maximize();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
}
