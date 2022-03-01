package annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest 
{
  @Test
  public void validLogin() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
  }
}
