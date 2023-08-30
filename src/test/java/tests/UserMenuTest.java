package tests;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.FileConsatant;
import pages.LoginPage;
import pages.UserMenuPage;

public class UserMenuTest extends BaseTest {
	@BeforeClass
	public void navigateToHome() throws IOException
	{
		WebDriver driver=BaseTest.getDriver();
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(driver);
		}
	@Test
	public void userMenuDropDown_TC06() throws IOException, InterruptedException
	{
	WebDriver driver=BaseTest.getDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	 UserMenuPage ump=new UserMenuPage(getDriver());
	// driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	 ump.userMenu.click();
	// driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  Assert.assertTrue(ump.verifyUserMenuItems(),"Failed to verify username");
  Assert.assertTrue(ump.selectMyProfile(driver),"");
  Assert.assertTrue(ump.isProfilePageVisible(),"");
  ump.selecteditContact(driver);
  Assert.assertTrue(ump.verifyEditContactPopup(driver),"");
  Assert.assertTrue(ump.verifyLastNameChangeInAboutTab(driver, "Rameem"));
  Assert.assertTrue( ump.verifyCreatePost(driver, "hello welcome"));
  Assert.assertTrue(ump.verifyFileUpload(driver, FileConsatant.USER_MENU_TESTDATA_FILE_PATH2));
  Assert.assertTrue(ump.verifyPhotoUpload(driver,FileConsatant.PROFILE_PHOTO_FILE_PATH));
  
  
}
}
