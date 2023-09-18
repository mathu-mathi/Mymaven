package tests;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.MavenListener;
import pages.LoginPage;
import pages.Opportunities;
import utilis.CommonUtils;

@Listeners(MavenListener.class)
public class OpportunitiesTest extends BaseTest 
{
		@BeforeClass
		public void navigateToHome() throws IOException {
			WebDriver driver = BaseTest.getDriver();
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp(driver);
		}

		@SuppressWarnings("deprecation")
		@Test ()
		public void userMenuDropDown_TC06() throws IOException, InterruptedException 
		{
			
			WebDriver driver = BaseTest.getDriver();
			Opportunities opp = new Opportunities(driver);
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			CommonUtils.waitForElement(driver, opp.Opportunities);
			
			
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title=\'User menu for Mathu mathi Thangavel\']")));

			opp.Opportunities.click();
			Assert.assertTrue(opp.selectOpportunities(driver, "failed to select"));
			Assert.assertTrue(opp.oppName(driver));
			CommonUtils.waitForElement(driver, opp.createnew);
			Assert.assertTrue(opp.oppName(driver));
			opp.lookUpWindow(driver);
			Assert.assertTrue(opp.originalWindow(driver));
			Assert.assertTrue(opp.pipeLine(driver));
		}
}



		
