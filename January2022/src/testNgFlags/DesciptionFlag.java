package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DesciptionFlag 
{
  @Test(description = "ShivJaynti Shubheccha")// this flag is is used to describe the Test Case.
  public void ShivJayanti() 
  {
	  Reporter.log("Happy ShivJaynti", true);
	  
  }
}
