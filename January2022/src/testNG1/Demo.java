package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void a()
	{
		System.out.println("Hi****");
	}
	@Test
	 public void b() 
	 {
		Reporter.log("hiii...");
	 }
	@Test
	 public void c() 
	 {
		Reporter.log("hiii", true);
	 }
}
