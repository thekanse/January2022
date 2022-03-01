package robot_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GeneratePrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(4000);
        
        for(int i=0;i<=0;i++)
        {
        	robot.keyPress(KeyEvent.VK_TAB); 
        	robot.keyRelease(KeyEvent.VK_TAB); 
        	Thread.sleep(3000);
        	}
        	robot.keyPress(KeyEvent.VK_ENTER); 
         	robot.keyRelease(KeyEvent.VK_ENTER); 	
         	Thread.sleep(3000);
        }	
	}
