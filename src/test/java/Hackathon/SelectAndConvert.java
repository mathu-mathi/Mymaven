package Hackathon;

import java.time.Duration;
//import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAndConvert 
{
	 public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.xe.com");
	        WebElement fromCurrencyDropdown = driver.findElement(By.className("combobox-chevron"));
	        fromCurrencyDropdown.click();
	        fromCurrencyDropdown.sendKeys("USD");
	        WebElement dropdown = driver.findElement(By.className("base-combobox__Faceplate-iyxb4f-0 hIrqrd combobox-faceplate"));
	        dropdown.click();
	        WebElement desiredFromOption = driver.findElement(By.cssSelector("li[id^='midmarketFromCurrency-option-6']"));
	        desiredFromOption.click();

	        WebElement ulElement = driver.findElement(By.id("myList"));

	        // Find all <li> elements within the <ul>
	        List<WebElement> liElements = ulElement.findElements(By.tagName("li"));

	        // Loop through each <li> element and print its text
	        for (WebElement li : liElements) {
	            System.out.println(li.getText());
	        }

	        // Close the WebDriver
	        driver.quit();


	       
	       // WebElement desiredToOption = driver.findElement(By.id("midmarketToCurrency-option-6")); 
	       // desiredToOption.click();
	        //dropdown.click(); // assuming you have to click the "dropdown" to open it
	       // List<WebElement> options = dropdown.findElements(By.tagName("ul[@id=\\'midmarketToCurrency-listbox"));
	       //for (WebElement option : options)
	        //{
	            //if (option.getText().equals(searchText))
	           // {
	               // option.click(); // click the desired option
	               // break;
	           // }
	        //}
	       

	       // WebElement toCurrencyDropdown = driver.findElement(By.xpath("//select[@id='to']/option[text()='INR']"));
	        //toCurrencyDropdown.click();

	       // WebElement searchbox=driver.findElement(By.id("midmarketToCurrency-descriptiveText"));
	       // searchbox.click();
	       // List<WebElement>allList=driver.findElements(By.xpath("//ul[@id=\'midmarketToCurrency-listbox\']"));
	        //WebElement toCurrencyDropdown = driver.findElement(By.id("midmarketToCurrency"));
		   // Select select = new Select(toCurrencyDropdown);
		    //select.selectByVisibleText("INR");
	        //JavascriptExecutor je = (JavascriptExecutor) driver;
	      //Identify the WebElement which will appear after scrolling down
	     // WebElement element = driver.findElement(By.id("midmarketToCurrency-listbox"));
	      // now execute query which actually will scroll until that element is not appeared on page.
	     // je.executeScript("arguments[0].scrollIntoView(true);",element);
	        WebElement convertButton = driver.findElement(By.xpath("//button[@class=\"button__BaseButton-sc-1qpsalo-0 clGTKJ\"]"));
	        convertButton.click();
	        // Select USD in the From currency dropdown
	       

	        // Select INR in the To currency dropdown
	       

	        // Click the Convert button

	        // Wait for a few seconds to see the result
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
}



	

	





