package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage 
{
	public WebDriver driver;
	
	
	By login=By.cssSelector("a[href*='sign_in']");
	By cancel=By.xpath("//button[text()='NO THANKS']");
	By text=By.xpath("//h2[text()='Featured Courses']");
	
	
	
	
	

	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}


	
	
	public WebElement clickCancel()
	{
		return driver.findElement(cancel);
	}
	
	public WebElement clickSignIn()
	{
		return driver.findElement(login);
	}
	
}
