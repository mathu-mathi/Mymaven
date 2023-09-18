package utilis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.FileConstants;
import constants.WaitConstants;

public class CommonUtils {
	public static boolean waitForElement(WebDriver driver, WebElement element) {
		boolean isElementClickable = false;
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			isElementClickable = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isElementClickable;
	}

	
	public static boolean waitForElementToDisappear(WebDriver driver, WebElement element) {
		boolean isElementFound = false;
		WebDriverWait wait = new WebDriverWait(driver, WaitConstants.WAIT_FOR_ELEMENT_TO_DISAPPEAR);
		try {
			wait.until(ExpectedConditions.invisibilityOf(element));
			isElementFound = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isElementFound;
	}
	public static WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec,WebDriver driver)
	{

	    FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40)).pollingEvery(Duration.ofSeconds(20))
	    .ignoring(NoSuchElementException.class, TimeoutException.class);

	    for (int i = 0; i < 2; i++) {
	        try {
	            //fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We are processing through trillions of data events, this insight may take more than 15 minutes to complete.']")));
	            fWait.until(ExpectedConditions.visibilityOf(element));
	            fWait.until(ExpectedConditions.elementToBeClickable(element));
	        } 
	        catch (Exception e) {

	            System.out.println("Element Not found trying again - " + element.toString().substring(70));
	            e.printStackTrace();
	        }
	    }

	    return element;
	}
	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
public static String getDateAndTimeStamp()
{
	String value=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	return value;
}
public static String getScreenShot(WebDriver driver)throws IOException
{
	String path=FileConstants.SCREENSHOT_FOLDER_PATH;
	TakesScreenshot screen= (TakesScreenshot)driver;
	File src=screen.getScreenshotAs(OutputType.FILE);
	File dst=new File(path);
	FileUtils.copyFile(src, dst);
	return path;

}


public static void waitForElementToDisappear(WebDriver driver, boolean verifyDropDown) {
	// TODO Auto-generated method stub
	
}
}
