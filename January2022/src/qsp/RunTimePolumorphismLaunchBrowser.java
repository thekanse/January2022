package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolumorphismLaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the browser name ither Chrome or Firefox");
		String browserValue =sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("Chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// To avoid Illegle state exception
		driver=new ChromeDriver();// to open the chrome browser
		driver.manage().window().maximize();// To maximize the browser.
		Thread.sleep(5000);
		driver.get("https://www.google.com");// To open website.
		Thread.sleep(5000);
		driver.close();// To 
		}
else if(browserValue.equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// To avoid illegle state exception. 
		driver=new FirefoxDriver(); // T
		driver.manage().window().maximize();
		driver.get("https://www.gogle.com");
		driver.close();
		}
		else
		{
		System.out.println("Enyter the valid input");
		}
	}
}
}
