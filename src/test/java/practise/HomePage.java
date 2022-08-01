package practise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class HomePage extends BaseClass {

		
	

	@Test(dataProvider = "getdata")
	public void basePageNavigation(String user, String password) throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.clickCancel().click();
		Thread.sleep(5000);
		lp.clickSignIn().click();
		System.out.println("done");
		LoginPage lp1 = new LoginPage(driver);
		lp1.userEmail().sendKeys(user);
		lp1.userPassword().sendKeys(password);
		lp1.submitDetails().click();

	}

	

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];

		data[0][0] = "testpractise@gmail.com";
		data[0][1] = "test123";

		data[1][0] = "testpractise2@gmail.com";
		data[1][1] = "test1233";

		data[2][0] = "testpractise22@gmail.com";
		data[2][1] = "test12332";

		return data;
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	
}
