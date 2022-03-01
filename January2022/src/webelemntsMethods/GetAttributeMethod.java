package webelemntsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Krishna%20Kanse/Desktop/WebElement/Checkboxes.html");
		WebElement checkBox = driver.findElement(By.id("ch3"));
		String attributeValue = checkBox.getAttribute("name");
		System.out.println(attributeValue);
	}
}