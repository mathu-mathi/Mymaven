package Hackathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextValue {

	public static void main(String[] args) {

		 {  	WebDriverManager.chromedriver().setup();
		     	WebDriver driver=new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			    driver.get("https://www.google.com");
			    WebElement searchbox=driver.findElement(By.name("q"));
			    JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("arguments[0].value='selenium'", searchbox);
			    
			 

		// TODO Auto-generated method stub

	}

}
}

