package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.MavenListener;
import pages.AccountPage;
import pages.LoginPage;
import utilis.CommonUtils;
@Listeners(MavenListener.class)
public class AccountsTest extends BaseTest{
	@Test
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(driver);
	}

	@Test ()
	public void userMenuDropDown_TC06() throws IOException, InterruptedException {
	
		
		WebDriver driver = BaseTest.getDriver();
		AccountPage ap = new AccountPage(driver);
		CommonUtils.waitForElement(driver, ap.Accounts_tab);
		ap.Accounts_tab.click();
		Assert.assertTrue(ap.CreateAccount(driver));
		Assert.assertTrue(ap.verifyCreatenewView(driver));
		CommonUtils.waitForElement(driver, ap.createNewview);
		Assert.assertTrue(ap.createViewNmae(driver, ""));
		Assert.assertTrue(ap.clickOnSaveButton(driver));
		
		

}
}
