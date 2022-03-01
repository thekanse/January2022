package action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Krishna%20Kanse/OneDrive/Desktop/WebElement/dragdrop.html");
		WebElement drag = driver.findElement(By.id("draggable-2"));
		WebElement drop = driver.findElement(By.id("droppable-2"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

	}

}
