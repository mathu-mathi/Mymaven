package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://Login.salesforce.com");
		
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		
		WebElement email=driver.findElement(By.id("email_field"));
		   //Keyboard keyboard=((HasInputDevices)driver).getKeyboard();
		driver.findElement(By.id("password_field")).sendKeys("admin123");
	driver.findElement(By.xpath("//[text()=\"Login to Account\"]")).click();
		Thread.sleep(3000);
				
		// TODO Auto-generated method stub

	}

}
