package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_TextFunction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(null));
	}

}
