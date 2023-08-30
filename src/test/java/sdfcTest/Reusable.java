package sdfcTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reusable 
{
public static void enterText(WebElement obj,String text,String objName)throws Exception
{
	if(obj.isDisplayed())
	{
		Thread.sleep(3000);
		obj.sendKeys(text);
		System.out.println("pass:"+text+"value is enter"+objName+"field");
	}
	System.out.println("fail"+objName+"field");
	}

public static void selectCheckBox(WebElement obj,String objName)throws Exception
{
	if(obj.isDisplayed())
	{
		Thread.sleep(3000);
		obj.click();
		System.out.println("pass:"+objName+" is already selected");
	}
	System.out.println("fail"+objName+"its not present ");
	}
public static void selectDropdown(WebElement obj, String objName)
{
	
	if(obj.isDisplayed())
	{
		System.out.println("Pass: "+objName+" is  selected");
		obj.click();
	}else
	{
	
		System.out.println("Fail:"+objName+" is not present.Please chk application");	
	}
}
public static void frame(WebDriver driver,WebElement obj)
{
	if(obj.isDisplayed())
	{
		driver.switchTo().frame(obj);
		System.out.println("pass:"+obj+"we can switch");
	}
	System.out.println("fail"+obj+"its not present ");
}
public static void frameid(WebDriver driver,WebElement obj)
{
	if(obj.isDisplayed())
	{
		driver.switchTo().frame(obj);
		System.out.println("pass:"+obj+"we can switch");
	}
	System.out.println("fail"+obj+"its not present ");
}

public static void defaultframe(WebDriver driver,WebElement obj)
{
	if(obj.isDisplayed())
	{
		driver.switchTo().frame(obj);
		System.out.println("pass:"+obj+"we can switch");
	}
	System.out.println("fail"+obj+"its not present ");
}
public static void mouseover(WebDriver driver,WebElement obj)
{
	if(obj.isDisplayed())
	{
		Actions action=new Actions(driver);
		action.moveToElement(obj).build().perform();
		System.out.println("pass:"+obj+"is present");
	}
		else
		{
			System.out.println("fail:"+obj+"is present");
		}
		}
			
public static void RadioButton(WebElement obj,String objName)
{
	if(obj.isDisplayed())
	{
		obj.click();
		System.out.println("pass"+objName+"is clicked");
	}
	else
	{
		System.out.println("fail"+objName+"is not clicked");
		
	}
	}
}
