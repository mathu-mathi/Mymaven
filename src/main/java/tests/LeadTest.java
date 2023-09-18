package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LeadsPage;
import pages.LoginPage;
import utilis.CommonUtils;

public class LeadTest extends BaseTest {
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(driver);
	}

	@Test ()
	public void Lead() throws IOException, InterruptedException 
	{
		
		WebDriver driver = BaseTest.getDriver();
		LeadsPage lp= new LeadsPage(driver);
		driver.manage().window().maximize();
		CommonUtils.fluientWaitforElement(lp.Leads, 10,20, driver);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Assert.assertTrue(lp.selectLead(),"Failed to verify lead");
		Assert.assertTrue(lp.verifyDropDown(driver), "");
		CommonUtils.waitForElementToDisappear(driver,lp.verifyDropDown(null));
		Assert.assertTrue(lp.selectLeads(driver), "");
		Assert.assertTrue(lp.selectLogout(driver," sOption"));
		Assert.assertTrue(lp.selectgoButton(driver), "");
		Assert.assertTrue(lp.verifyTodayLeads(driver));
		Assert.assertTrue(lp.selectNewButton(driver));
		Assert.assertTrue(lp.selectLeadStatus(driver, "string"));
		Assert.assertTrue(lp.verifyLastName(driver));
		
		
	}
}
