package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConsatant;
import pages.LoginPage;
import utils.FileUtils;

public class LoginTest extends BaseTest 
{
@Test
public void logintest1() throws IOException
{
	//line2123 ramesh
	//line33435 madhu
	WebDriver driver=BaseTest.getDriver();
	LoginPage lp=new LoginPage(driver);
	driver.get("https://login.salesforce.com"); //ramesh & madhu
	 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	lp.username.sendKeys(FileUtils.readPropertiesFile(FileConsatant.LOGIN_TESTDATA_FILE_PATH2,"username"));
	lp.password.sendKeys(FileUtils.readPropertiesFile(FileConsatant.LOGIN_TESTDATA_FILE_PATH2,"password"));
	
	//Assert.assertEquals(lp.selectRememberMeCheckBox(), "");
	
	lp.loginButton.click();
	
}
}
	
/*public void logintest2()
{

	WebDriver driver=BaseTest.getDriver();
	driver.get("https://login.salesforce.com");
}
}*/

