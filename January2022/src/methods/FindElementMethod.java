package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("admin123");
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.id("btnLogin"));
	login.click();
	Thread.sleep(10000);
	driver.quit();
	}
}
