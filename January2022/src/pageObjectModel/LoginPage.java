package pageObjectModel;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
		//Declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInLabel") private WebElement rememberMe;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
			
       //Initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
			
		//utilization
		
	public WebElement getUsn() 
	{
		return usn;
	}
	public WebElement getPwd() 
	{
		return pwd;
	}
	public WebElement getLoginbtn() 
	{
		return loginbtn;
	}
	public WebElement getRememberMe() 
	{
		return rememberMe;
	}
	public WebElement getLogo() 
	{
		return logo;
	}
	
	//operational method
	
	public void delayOfTwoSecond() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	//generic reusable methods.
	public void validLogin(String validUsername, String validPassword)
	{
	usn.sendKeys(validUsername);
	pwd.sendKeys(validPassword);
	loginbtn.click();
	}
	
	public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
	{
	usn.sendKeys(invalidUsername);
	Thread.sleep(2000);
	pwd.sendKeys(invalidPassword);
	Thread.sleep(2000);
	loginbtn.click();
	Thread.sleep(2000);
	usn.clear();
	}
	
}
