package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void failed() 
  {
	 int shamID;
	 int id =12;
	 shamID=id/0;
	 System.out.println(shamID);
  }
}
