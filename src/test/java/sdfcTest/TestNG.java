package sdfcTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNG 
{
	 private WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.login.salesforce.com");
	    }

	    @Test
	    public void testLogin() {
	        // Login to Salesforce
	        // ...
	    }
	    public void testCreateNewView() {
	        // Click on create new view link
	        WebElement createNewViewLink = driver.findElement(By.linkText("Create New View"));
	        createNewViewLink.click();

	        // Enter view details
	        WebElement viewNameField = driver.findElement(By.id("fname"));
	        viewNameField.sendKeys("New View Name");

	        // Select other fields and set their values as needed

	        // Click on save button
	        WebElement saveButton = driver.findElement(By.xpath("//input[@value='Save']"));
	        saveButton.click();

	        // Validate the new view is displayed (for example, by checking if it appears in the view dropdown)
	        // You might need to wait for the view to appear and verify its presence
	        // ...
	    }

	    // Implement similar methods for other scenarios...

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}
	

