package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependent_Independent2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cello Pen");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//span[text()='Cello Finegrip Blue Ball Pen - Jar 25 Units | Ball Pens for Smooth Writing | Blue Ball Pens | Ball Pens for School & Office | Ideal for Work from Home | Cello Stationery']/ancestor::div[@class='a-section a-spacing-none']/descendant::span[@class='a-price-whole'])[1]")).click();
	Thread.sleep(8000);
	driver.quit();
	}
}
