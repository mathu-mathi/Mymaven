package sdfcTest;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends Reusable
{
	public static void main(String[] args) throws InterruptedException
	{
		
	   	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Mathu@ram.com");
		driver.findElement(By.id("Password")).sendKeys("Admin@123");
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		driver.manage().window().maximize();
		String expected="Please enter the password.If you still can't log in,contact your administrator";
		String actual=driver.findElement(By.id("error")).getText();
		
		if(actual.equals(expected))
		{
         System.out.println("Matched");
		}
       else
        {
	System.out.println("failed");
	  }
		String errormsg=driver.findElement(By.xpath("//div[@id='error']")).getText();
		if(errormsg.equals("please check your username and password.If you still can't log in,contact your administrator"))
		{
			System.out.println("error is displayed");
		}
			else
				
			{
				System.out.println("error is not displayed");
			}
		 WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
         if (userMenu.isDisplayed())
         {
             System.out.println("User menu dropdown is available.");
         }
         else 
         {
             System.out.println("User menu dropdown is not available.");
         }
         userMenu.click();
         Thread.sleep(2000);
         WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
         logout.click();
	}
	
}
