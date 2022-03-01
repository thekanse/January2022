package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMultipleOptionInReversOrder 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/multiSelectDropdown.html");
	WebElement elements = driver.findElement(By.id("menu"));
	Select sel = new Select(elements);
	for(int i=0;i<=5;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(2000);
	}
	Thread.sleep(3000);
	for(int i=5;i>=0;i--)
	{
		sel.deselectByIndex(i);
		Thread.sleep(2000);
	}
	}
}
