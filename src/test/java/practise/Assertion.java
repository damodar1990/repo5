package practise;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import junit.framework.Assert;
import pageObjects.GetTextAssetion;
import resources.BaseClass;

public class Assertion extends BaseClass
{
	 private static Logger log=LogManager.getLogger(BaseClass.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test()
	public void basePageAssertion() throws IOException
	{
		
		GetTextAssetion gt=new GetTextAssetion(driver);
		Assert.assertEquals(gt.getName().getText(),"FEATURED COURSES" );
		
	}
	
	@AfterTest
	public void tdown()
	{
		driver.close();
	}

}
