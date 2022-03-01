package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(4000);
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//a[contains(@id,'PimModule')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@id,'addEmployee')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys("Krishna");
	driver.findElement(By.id("middleName")).sendKeys("Govindrao");
	driver.findElement(By.id("lastName")).sendKeys("Kanse");
	Thread.sleep(7000);
	driver.findElement(By.id("employeeId")).clear();
	driver.findElement(By.id("employeeId")).sendKeys("112");
	WebElement targer = driver.findElement(By.id("photofile"));
	Actions act = new Actions(driver);
	act.doubleClick(targer).perform();
		}

}
