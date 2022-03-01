package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
  @Test()
  public void signIn() 
  {
	Reporter.log("Login Feture", true);  
  }
  @Test(dependsOnMethods = "signIn")
  public void logout() 
  {
	Reporter.log("LogOut Feture", true);  
  }
}
