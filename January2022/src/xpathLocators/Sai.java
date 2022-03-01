package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sai 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("cartoon");
		Thread.sleep(5000);
		
	}

}
