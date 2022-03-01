package webelemntsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		WebElement Select = driver.findElement(By.xpath("(//div[.='Core i5'])[2]"));
		Select.click();
		boolean selectedStatus = Select.isSelected();
		Thread.sleep(4000);
		System.out.println(selectedStatus);
	}
}
