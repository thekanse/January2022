package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{
public static void main(String[] args) 
{
	System.out.println("Opened FireForx Browser");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	new FirefoxDriver();
}

}
