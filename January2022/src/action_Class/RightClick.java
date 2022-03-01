package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/dragdrop.html");
	WebElement element = driver.findElement(By.id("droppable-2"));
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
	}
}
