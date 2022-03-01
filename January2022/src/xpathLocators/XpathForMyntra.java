package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForMyntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jackets", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class='common-customRadio gender-label undefined']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']")).click();
	} 
}
