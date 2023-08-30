package Hackathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args)
	{

		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.amazon.com");

	        // Search for "kindle"
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("kindle");
	        searchBox.submit();

	        // Click on the first product with "Amazon's Choice"
	        WebElement amazonChoiceProduct = driver.findElement(By.xpath("//span[contains(text(),\"Amazon's Choice\")]//ancestor::div[@data-asin]"));
	        amazonChoiceProduct.click();

	        // Add the product to cart
	        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
	        addToCartButton.click();

	        // Go to cart
	        driver.get("https://www.amazon.com/gp/cart/view.html");

	        // Verify item in the cart
	        WebElement cartItem = driver.findElement(By.xpath("//span[@data-asin-title='Kindle']"));
	        if (cartItem.isDisplayed()) {
	            System.out.println("Item verified in cart: " + cartItem.getText());
	        } else {
	            System.out.println("Item not found in cart.");
	        }

	        // Close the browser
	        driver.quit();
	    }





		// TODO Auto-generated method stub

	}

