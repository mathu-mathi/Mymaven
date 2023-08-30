package sdfcTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leads extends Reusable
{
	WebDriver driver;

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		//case 20
		 WebElement leadsTab = driver.findElement(By.linkText("Leads"));
	     leadsTab.click();

	     // Do something on the Leads page (e.g., validate some elements, perform actions)

	     // Log out
	     WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
	     userMenu.click();
	     WebElement logoutLink = driver.findElement(By.linkText("Logout"));
	     logoutLink.click();
	    
			WebElement leadtab = driver.findElement(By.linkText( "Leads"));
			    leadtab.click();

			    //Wait for the drop-down list to be visible
			  WebElement   dropdown = driver.findElement(By.id( "your_dropdown_id"));

			    //Click on the drop-down list handle
			    dropdown.click();

			    //Wait for the options to be visible in the drop-down
			    WebElement option=driver.findElement(By.xpath( "//ul[@class='dropdown-menu']/li"));

			   //Assuming the options have specific texts as you mentioned
			   String[] optiontexts = {"All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads"};
			        option = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='{option_text}']"));
			        option.click();
		

	//case 22
		
	//select class for dropdown
	Select se=new Select(driver.findElement(By.xpath("//*[@id ='fcf']")));
	//select an item with text  visible
	se.selectByVisibleText("My unread leads");
	WebElement go=driver.findElement( By.className("btn"));
	go.click();
	WebElement display = driver.findElement(By.id("ext-gen6"));
	if (display.isDisplayed())
	{
	    System.out.println("My unread leads is available");
	}
	else 
	{
	    System.out.println(" My unread leads is not available.");
	}


	//case 23
	Select se1=new Select(driver.findElement(By.xpath("//*[@id ='fcf']")));
	se1.selectByVisibleText("Today's Leads");
	WebElement go1=driver.findElement( By.className("btn"));
	go.click();
	//Boolean display1=driver.findElement(By.id("ext-gen6")).isDisplayed();
	WebElement display1 = driver.findElement(By.id("ext-gen6"));
	if (display1.isDisplayed())
	{
	    System.out.println("My unread leads is available");
	}
	else 
	{
	    System.out.println(" My unread leads is not available.");
	}

	//case 24

	WebElement le=driver.findElement(By.id("createNewButton"));
	le.click();
	Boolean leaddisplay=driver.findElement(By.id("bodycell")).isDisplayed();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'name_lastlea2\']")));

	// Enter "ABCD" in the last name field
	lastNameField.sendKeys("kumar");

	// Enter "ABCD" in the company name field
	WebElement companyNameField = driver.findElement(By.id("companyNameFieldId"));
	companyNameField.sendKeys("Thangam");

	// Click on the "Save" button
	WebElement saveButton = driver.findElement(By.id("saveButtonId"));
	saveButton.click();

	// Wait for the newly created lead view page to open
	WebElement leadViewPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leadViewPageId")));

}
}
