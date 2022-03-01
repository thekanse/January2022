package practiceFolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFirst5OptionsByUsingIndexValue 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/multiSelectDropdown.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("menu"));
		Select sel=new Select(element);
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(8000);
		for(int k=5;k>=0;k--)
		{
			sel.deselectByIndex(k);
			Thread.sleep(3000);
		}
	}

}
