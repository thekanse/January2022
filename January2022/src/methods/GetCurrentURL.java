package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jhps.edu.in");
	Thread. sleep(4000);
	String currentURL=driver.getCurrentUrl();
	System.out.println(currentURL);
	driver.close();
	}
}
