package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/multiSelectDropdown.html");
		WebElement elements = driver.findElement(By.id("menu"));
		Select sel=new Select(elements);
		WebElement options = sel.getWrappedElement();
		System.out.println(options.getText());	
		
	}

}
