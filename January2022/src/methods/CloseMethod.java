package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//line number 10 is used to avoid Illegal state exception.
	WebDriver driver=new ChromeDriver();// to launch the browser.
	driver.get("https://www.sai.org.in/");// to launch web application.
	Thread.sleep(3000);// to give the delay time.
	driver.manage().window().maximize();// to maximize window
	Thread.sleep(5000);
	driver.close();	//to close the window open by selenium.
	}
}
