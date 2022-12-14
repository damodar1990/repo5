package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	public  WebDriver driver;
	@FindBy(id="user_email")
	 WebElement email;
	@FindBy(id="user_password")
	WebElement password;
	@FindBy(name="commit")
	WebElement submit;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this
				);
	}

	public WebElement userEmail()
	{
		return email;
	}
   
	public WebElement userPassword()
	{
		return password;
	}
	
	public WebElement submitDetails()
	{
		return submit;
	}
}
