package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 
{
  @Test(groups = "Functional")
  public void ft1()
  {
	  Reporter.log("Functional Test cse1", true);
  }
  @Test(groups = "Smoke")
  public void st1()
  {
	  Reporter.log("Smoke Test case1", true);
  }
  @Test(groups ="Intigration" )
  public void it1()
  {
	  Reporter.log("Intigration Test case1", true);
  }
  
  @Test(groups = "Functional")
  public void ft2()
  {
	  Reporter.log("Functional Test cse2", true);
  }
  @Test(groups = "Smoke")
  public void st2()
  {
	  Reporter.log("Smoke Test case2", true);
  }
  @Test(groups ="Intigration" )
  public void it2()
  {
	  Reporter.log("Intigration Test case2", true);
  }
  
  @Test(groups = "Functional")
  public void ft3()
  {
	  Reporter.log("Functional Test cse3", true);
  }
  @Test(groups = "Smoke")
  public void st3()
  {
	  Reporter.log("Smoke Test case3", true);
  }
  @Test(groups ="Intigration" )
  public void it3()
  {
	  Reporter.log("Intigration Test case3", true);
  }
  
  @Test(groups = "Functional")
  public void ft4()
  {
	  Reporter.log("Functional Test cse4", true);
  }
  @Test(groups = "Smoke")
  public void st4()
  {
	  Reporter.log("Smoke Test case4", true);
  }
  @Test(groups ="Intigration" )
  public void it4()
  {
	  Reporter.log("Intigration Test case4", true);
  }
  
  @Test(groups = "Functional")
  public void ft5()
  {
	  Reporter.log("Functional Test cse5", true);
  }
  @Test(groups = "Smoke")
  public void st5()
  {
	  Reporter.log("Smoke Test case5", true);
  }
  @Test(groups ="Intigration" )
  public void it5()
  {
	  Reporter.log("Intigration Test case5", true);
  }
  
  @Test(groups = "Functional")
  public void ft6()
  {
	  Reporter.log("Functional Test cse6", true);
  }
  @Test(groups = "Smoke")
  public void st6()
  {
	  Reporter.log("Smoke Test case6", true);
  }
  @Test(groups ="Intigration" )
  public void it6()
  {
	  Reporter.log("Intigration Test case6", true);
  }
  
}
