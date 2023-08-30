package utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.WaitConstant;

public class CommonUtils {
	public static boolean WaitForElement(WebDriver driver,WebElement element) 
	{
	boolean isElementClickable=false;	
     WebDriverWait wait=new WebDriverWait(driver,WaitConstant.WAIT_FOR_ELEMENT);
     try
     {
     wait.until(ExpectedConditions.elementToBeClickable(element));
     isElementClickable=true;
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
     return  isElementClickable;
		
		// TODO Auto-generated method stub

	}
	public static boolean WaitForElementDisappear(WebDriver driver,WebElement element) 
	{
	boolean isElementClickable=false;	
     WebDriverWait wait=new WebDriverWait(driver,WaitConstant.WAIT_FOR_ELEMENT_TO_DISAPPEAR);
     try
     {
     wait.until(ExpectedConditions.elementToBeClickable(element));
     isElementClickable=true;
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
     return  isElementClickable;
		
		// TODO Auto-generated method stub

	}
	public static void moveToElement(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
}
