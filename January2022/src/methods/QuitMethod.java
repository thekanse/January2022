package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//line number 10 is used to avoid Illegal state exception.
	WebDriver driver = new ChromeDriver();// to launch the chrome browser.
	Thread.sleep(10000);// to give the delay time.
	driver.quit();// to close the browsers which is opened by selenium.
	}
}
