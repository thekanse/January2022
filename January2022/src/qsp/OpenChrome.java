package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {	
	public static void main(String[] args) {
	System.out.println("Ganpatti Bappa Moraya");
	System.setProperty("webdriver.chrome.driver", "./divers/chromedriver.exe");
	new ChromeDriver();

	}

}
