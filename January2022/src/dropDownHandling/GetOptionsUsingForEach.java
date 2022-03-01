package dropDownHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsUsingForEach 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/"
		+ "WebElement/multiSelectDropdown.html");
		Thread.sleep(8000);
		WebElement dropDownElement = driver.findElement(By.id("menu"));
	
		Select sel = new Select(dropDownElement);
		List<WebElement> optionsOfDropDown = sel.getOptions();
		for(WebElement options: optionsOfDropDown)
		{
			String textOfOptions = options.getText();
			System.out.println(textOfOptions);
		}
	}
}
