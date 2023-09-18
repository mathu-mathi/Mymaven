package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import constants.FileConstants;
import listeners.MavenListener;
import pages.LoginPage;
import pages.UserMenuPage;
import utilis.CommonUtils;
@Listeners(MavenListener.class)
public class UserMenuTest extends BaseTest {
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(driver);
	}

	@Test ()
	public void userMenuDropDown_TC06() throws IOException, InterruptedException 
	{
		
		WebDriver driver = BaseTest.getDriver();
		UserMenuPage ump = new UserMenuPage(driver);
		driver.manage().window().maximize();
		CommonUtils.fluientWaitforElement(ump.userMenu, 10,20, driver);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		CommonUtils.waitForElement(driver, ump.userMenu);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title=\'User menu for Mathu mathi Thangavel\']")));

		ump.userMenu.click();
		Assert.assertTrue(ump.verifyUserMenuItems(), "Failed to verify user menu options");
		Assert.assertTrue(ump.selectMyProfile(), "");
		CommonUtils.waitForElement(driver, ump.profilePage);
		Assert.assertTrue(ump.isProfilePageVisible(), "");
		ump.selectEditContact(driver);
		Assert.assertTrue(ump.verifyEditContactPopUp(driver), "");
		Assert.assertTrue(ump.verifyLastNameChangeInAboutTab(driver, "Tekarch"), "");
		Assert.assertTrue(ump.verifyCreatePost(driver, "Hello welcome to java"));
		Assert.assertTrue(ump.verifyFileUpload(driver, FileConstants.LOGIN_TESTDATA_FILE_PATH));
		Assert.assertTrue(ump.verifyPhotoUpload(driver, FileConstants.PROFILE_PHOTO_PATH));
		Assert.assertTrue(ump.selectDeveloperConsole(driver)," ");
		Assert.assertTrue(ump.isDeveloperConsoleVisible(),"");
		Assert.assertEquals("My Developer Console","Failed");
		CommonUtils.waitForElement(driver, ump.Logout);
	    ump.Logout.click();
//		Assert.assertEquals(ump.selectRandomOption(), "My profile", "Failed");
		
	}

}

