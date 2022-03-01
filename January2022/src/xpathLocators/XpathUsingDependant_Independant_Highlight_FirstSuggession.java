package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependant_Independant_Highlight_FirstSuggession 
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
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='col col-7-12']/descendant::span[@class='_2_R_DZ'])[1]"));
		
	}

}
