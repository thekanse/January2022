package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFlipcart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Processor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_3879cV'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='DELL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@alt,'nd Lig...')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Place Order']")).click();
	}
}
