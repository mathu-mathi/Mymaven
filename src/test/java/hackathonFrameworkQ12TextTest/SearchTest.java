package hackathonFrameworkQ12TextTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hackathonFrameworkQ12Text.HomePage;

public class SearchTest extends BaseTestText {
		public void SearchTestest1() throws IOException
		{
			WebDriver driver=BaseTestText.getDriver();
			HomePage hp=new HomePage();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://www.google.com");
		    WebElement searchbox=driver.findElement(By.name("q"));
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].value='selenium'", searchbox);
		    
		 
		}
	}


