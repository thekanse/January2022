package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest 
{
  @Test
  public void testScript1() 
  {
	  Reporter.log(null);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("BeforeMethod", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AfterMethod", true);
  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Before Class", true);

  }
  
  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After Class", true);

  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("Before Test", true);

  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("after Test", true);
 
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("before suit", true);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("after suit", true);      
  }

}
