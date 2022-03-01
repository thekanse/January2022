package pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest1
{
	public void getThetitleOfWebPage()
	{
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}
	
	public void verifyTheTitleOfWebPage()
	{
		
	}
    
	public void mouseHOverAction(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
	}
	
	public void dragAndDrop(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();		
	}
	
	//refresh

		public void refreshTheBrowser() 
		{
			driver.navigate().refresh();
		}

		// PopupHandeling
		
		public void acceptAlertPopup() {
			Alert al = driver.switchTo().alert();

			String pop1 = al.getText();
			System.out.println(pop1);
			al.accept();
		}
		
		public void acceptConfirmationPopup() 
		{
			Alert al = driver.switchTo().alert();

			String pop1 = al.getText();
			System.out.println(pop1);
			al.accept();
			
		}
		public void dismissAlertPopup() 
		{
			Alert al = driver.switchTo().alert();

			String pop1 = al.getText();
			System.out.println(pop1);
			al.dismiss();
		}
		public void dismissConfirmationPopup() 
		{
			Alert al = driver.switchTo().alert();

			String pop1 = al.getText();
			System.out.println(pop1);
			al.dismiss();	
		}
		
		//implicitlyWait
		@SuppressWarnings("deprecation")
		public void implicitlyWait(long implicitlyTime) 
		{
		driver.manage().timeouts().implicitlyWait(implicitlyTime, TimeUnit.SECONDS);
		}
		
		// takescreenshot
		 public void takeathesScreenShot() throws IOException
		 {
			 TakesScreenshot ts = (TakesScreenshot)driver;
			 File src = ts.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./screenshots/screenshot5.png");
			 Files.copy(src, dest);
		 }
		 //scroll down
		public void scrolldown () 
		 {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");
		}

		//scroll Up
		public void scrollup() 
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,-500)");
		}

		//scroll right
		public void scrollright() 
		{
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(-5000,0)");
			}

			//scroll left
			public void scrollleft() 
			{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(5000,0)");
			}
			//Handellig dropDown
			public void HandleDropDown(WebElement element, int i)
			{
				Select sel = new Select(element);
				sel.selectByIndex(i);
			}
			
			public void HandleDropDown(WebElement element, String i)
			{
				Select sel = new Select(element);
				sel.selectByValue(i);
			}
			
			public void HandleDropDown(String txtValue,WebElement element)
			{
				Select sel = new Select(element);
				sel.deselectByVisibleText(txtValue);
			}
		} 
