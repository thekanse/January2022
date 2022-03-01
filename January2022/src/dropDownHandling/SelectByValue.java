package dropDownHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/singleSelectDropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		sel.selectByValue("5");
	}
}
