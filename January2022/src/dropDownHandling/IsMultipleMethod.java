package dropDownHandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/multiSelectDropdown.html");
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(9000);
	WebElement dropDownElement = driver.findElement(By.id("menu"));
	Select sel =new Select(dropDownElement);
	boolean statusOfList = sel.isMultiple();
	System.out.println(statusOfList);
	}
}