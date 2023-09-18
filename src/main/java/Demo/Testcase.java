package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("mathu@ram.com");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		String expected="please enter the password";
		String actual=driver.findElement(By.id("error")).getText();
		if(actual.equals(expected))
		{
         System.out.println("Matched");
		}
       else
        {
	System.out.println("failed");
	  }
      driver.findElement(By.className("menuButtonMenuLink")).click();
      driver.findElement(By.id("forgot_password_link")).click();
      
      driver.findElement(By.xpath("//input[@id='lastName']")).getText();
      
}
	}

//driver.findElement(By.xpath("//[text()=\"Login to Account\"]")).click();