package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Krishna%20Kanse/Desktop/WEB_TECHNOLOGY/Assignments/Assignment%201/Tribute.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Childhood ")).click();
		Thread.sleep(3000);
		driver.quit();
	}		
}