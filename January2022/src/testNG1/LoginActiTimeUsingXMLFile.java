package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginActiTimeUsingXMLFile 
{
	WebDriver driver;
  @Test
  
  @Parameters({ "username", "password"})
  public void loginActiTime(String userName, String password)
  {
	  System.setProperty("webfriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=26lm5lvm3xwk6");
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
  }
}
