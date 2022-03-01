package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// the above line to avoid Illegal state exception.
	WebDriver driver = new ChromeDriver();// to launch the chrome browser.
	Thread.sleep(5000);// to give the delay time.
	driver.get("https://jhps.edu.in/number-of-students-2020-21/");//to launch the web application.
	driver.manage().window().maximize();// to maximize the window.
	System.out.println(driver.getTitle());//to print the current webpage URL
	String titelofPage = driver.getTitle();
	System.out.println(titelofPage);
	Thread.sleep(5000);
	driver.close();
	}
}
