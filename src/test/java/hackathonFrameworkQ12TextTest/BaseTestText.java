package hackathonFrameworkQ12TextTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import tests.BaseTest;

public class BaseTestText {
	private static ThreadLocal<WebDriver>threadLocalDriver=new ThreadLocal<>();
	@BeforeTest
	public static void setDriver()
	{
		WebDriver driver=BaseTest.getBrowserType("chrome");
		threadLocalDriver.set(driver);
	}
	public static WebDriver getDriver()
	{
		return threadLocalDriver.get();
	}
	@AfterTest
	public static void removeDriver()
	{
		getDriver().close();
		threadLocalDriver.remove();
	}
public static WebDriver getBrowserType(String browserName)
{
	WebDriver driver;
	String browserType=browserName.toLowerCase();
	switch (browserType)
	{
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
	case "safari":
		driver=new SafariDriver();
		break;
		default:
			driver=null;
			break;
	}
	return driver;
	
	}
	
}

