package parllalExecution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Class3 
{
	WebDriver driver;
	@Test
	public void test3()
	{
		driver.switchTo().activeElement().sendKeys("Krishna", Keys.ENTER);
	}
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
