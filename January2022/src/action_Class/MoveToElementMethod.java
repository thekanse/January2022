package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bluestone.com/jewellery/officewear-rings.html");
		WebElement Ringstarget = driver.findElement(By.xpath("(//li[@class='menuparent repb'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(Ringstarget).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[.='Engagement']")).click();
		Thread.sleep(9000);
	}

}
