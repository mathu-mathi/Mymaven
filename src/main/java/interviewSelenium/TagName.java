package interviewSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium-prd.firebaseapp.com");
	WebElement email=driver.findElement(By.xpath("//input[@id='email_field']"));
	email.sendKeys("admin123@gmail.com");
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password_field']"));
	pwd.sendKeys("admin123");
	driver.findElement(By.xpath("//div[1]/button")).click();
	List<WebElement>links=driver.findElements(By.tagName("a"));
	 for (WebElement link : links) {
         System.out.println(link.getAttribute("Table")); // Get text of the element
         //System.out.println("Attribute (href): " + element.getAttribute("href")); // Get href attribute
     }
	Thread.sleep(3000);
	List<WebElement>row=driver.findElements(By.tagName("tr"));
	System.out.println(row.size());
	
}
}
