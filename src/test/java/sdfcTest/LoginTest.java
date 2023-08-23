package sdfcTest;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	public void Login() throws InterruptedException
	{ 
		//Mathu mathi thangavel
	   	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("Username")).sendKeys("Mathu@ram.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		String expected="Please enter the password";
		String actual=driver.findElement(By.id("error")).getText();
		if(actual.equals(expected))
		{
         System.out.println("Matched");
		}
       else
        {
	System.out.println("failed");
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
	
	}
}
