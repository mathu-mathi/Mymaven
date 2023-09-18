package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import constants.FileConstants;
import listeners.MavenListener;
import pages.LoginPage;
import utilis.CommonUtils;
import utilis.FileUtils;
@Listeners(MavenListener.class)
public class LoginTest extends BaseTest{
	@Test
	public void loginTest1() throws InvalidFormatException, IOException
	{
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		LoginPage lp = new LoginPage(driver);
		BaseTest.test.addScreenCaptureFromPath(CommonUtils.getScreenShot(driver));
		driver.get("https://login.salesforce.com");
		BaseTest.test.info("login salesforce is displayed");
		CommonUtils.waitForElement(driver, lp.username);
		BaseTest.test.info("username is displayed");
		BaseTest.test.addScreenCaptureFromPath(CommonUtils.getScreenShot(driver));
		lp.username.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
		lp.password.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "password"));
		BaseTest.test.info("password is displayed");
	
		//Assert.assertEquals(lp.selectRememberMeCheckBox(), "");
		CommonUtils.waitForElement(driver, lp.loginButton);
		lp.loginButton.click();
		BaseTest.test.info("login is clicked");;
		
	}
	@Test
	public void loginTest2() {
		
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		driver.get("https://login.salesforce.com");
		lp.username.sendKeys("mathu");
		lp.password.clear();
		lp.loginButton.click();
		
}
}
