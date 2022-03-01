package practiceFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Krishna%20Kanse/Desktop/WEB_TECHNOLOGY/Assignments/Assignment%2020/index.html");
	driver.close();
	}

}
