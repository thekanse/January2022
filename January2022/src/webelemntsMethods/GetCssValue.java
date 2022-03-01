package webelemntsMethods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCssValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[contains(@class, 'home-tril-email-btn')]"));
		String backcolor = search.getCssValue("background-color");
		System.out.println(backcolor);
	}   
}