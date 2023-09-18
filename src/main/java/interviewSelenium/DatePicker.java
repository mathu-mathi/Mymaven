package interviewSelenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			      WebDriver driver = new ChromeDriver();
			      String frdate = "20";
			      String todate = "26";
			  
			      // wait of 4 seconds
			      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
					
					driver.get("https://selenium-prd.firebaseapp.com/");
					
					
					WebElement email=driver.findElement(By.id("email_field"));
					email.sendKeys("admin123@gmail.com");
					   //Keyboard keyboard=((HasInputDevices)driver).getKeyboard();
					driver.findElement(By.id("password_field")).sendKeys("admin123");
				driver.findElement(By.xpath("//[text()='Login to Account']")).click();
					Thread.sleep(3000);
			      // maximize browser
			      driver.manage().window().maximize();
			      // identify frame and switch to it
			      WebElement e = driver.findElement(By.xpath("//input[@type=\"date\"]"));
			      e.click();
			      //driver.switchTo().frame(e);
			      // choose from date
			      //driver.findElement(By.xpath("//input[@id='from']")).click();
			      Thread.sleep(1000);
			      // choose month from dropdown
			      WebElement m = driver
			      .findElement(By.xpath("//div/select[@class='ui− datepicker−month']"));
			      Select s = new Select(m);
			      s.selectByVisibleText("Jan");
			      Thread.sleep(1000);
			      // select day
			      driver.findElement(By.xpath("//td[not(contains(@class,'ui−datepicker− month'))]/a[text()='"+frdate+"']")).click();
			      Thread.sleep(1000);
			      // choose to date
			      driver.findElement(By.xpath("//input[@id='to']")).click();
			      Thread.sleep(1000);
			      // choose month from dropdown
			      WebElement n = driver
			      .findElement(By.xpath("//div/select[@class='ui− datepicker−month']"));
			      Select sel = new Select(n);
			      sel.selectByVisibleText("Feb");
			      Thread.sleep(1000);
			      // select day
			      driver.findElement(By.xpath("//td[not(contains(@class,'ui−datepicker− month'))]/a[text()='"+todate+"']")).click();
			      Thread.sleep(1000);
			   }
			}
