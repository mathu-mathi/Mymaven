package sdfcTest;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Opportunities {
	


	
		//WebDriver driver=new ChromeDriver();
		public void SalesforceOpportunitiesTest()
		{
			WebDriver driver=new ChromeDriver();
			Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(10));
	{
		            // Click on "Opportunities" link
		            WebElement opportunitiesLink = driver.findElement(By.linkText("Opportunities"));
		            opportunitiesLink.click();

		            // Wait for the Opportunities page to load
		            // ...

		            // Verify opportunities drop down is present
		            WebElement opportunitiesDropDown = driver.findElement(By.id("fcf"));
		            if (opportunitiesDropDown.isDisplayed()) {
		                System.out.println("Opportunities drop down is present.");
		            } else {
		                System.out.println("Opportunities drop down is not present.");
		            }

		            // Get options from the drop down
		            Select select = new Select(opportunitiesDropDown);
		            List<WebElement> options = select.getOptions();
		            String[] expectedOptions = {"All Opportunities", "Closing Next Month", "Closing This Month",
		                    "My Opportunities", "New This Week", "Recently Viewed Opportunities", "Won"};

		            // Verify the options
		            for (String expectedOption : expectedOptions) {
		                boolean found = false;
		                for (WebElement option : options) {
		                    if (option.getText().equals(expectedOption)) {
		                        found = true;
		                        break;
		                    }
		                }
		                if (found) {
		                    System.out.println("Option '" + expectedOption + "' is available.");
		                } else {
		                    System.out.println("Option '" + expectedOption + "' is not available.");
		                }
		            }

		            	

		//case16
	        // Launch Salesforce and log in
	       
	        // Wait for the home page to load
	        // ...

	        // Click on "Opportunities" link from the main menu
	       

	        // Wait for the Opportunities page to load
	        // ...

	        // Click on "New" button to create a new Opportunity
	        WebElement newOpportunityButton = driver.findElement(By.name("new"));
	        newOpportunityButton.click();

	        // Wait for the New Opportunity page to load
	        // ...

	        // Fill in Opportunity details
	        WebElement opportunityNameField = driver.findElement(By.id("opp3"));
	        opportunityNameField.clear();
	        opportunityNameField.sendKeys("New Opportunity Name");

	        WebElement accountNameField = driver.findElement(By.id("opp4"));
	        accountNameField.sendKeys("Account Name");

	        WebElement closeDateField = driver.findElement(By.id("opp9"));
	        closeDateField.sendKeys("2023-12-31");

	        // Fill in other fields as needed

	        // Click on Save button
	        WebElement saveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']/input[@title='Save']"));
	        saveButton.click();

	        // Wait for the Opportunity details page to load
	        // ...
	        if (opportunitiesLink.isDisplayed()) {
	            System.out.println("New Opportunity page available.");
	        } else {
	            System.out.println(" New Opportunity pageis not available.");
	        }

	//case17

	    
	        // Click on "Opportunities" link from the main menu
	        

	        // Wait for the Opportunities page to load
	        // ...

	        // Click on "Opportunity Pipeline" link under Reports
	        WebElement opportunityPipelineLink = driver.findElement(By.linkText("Opportunity Pipeline"));
	        opportunityPipelineLink.click();

	        // Wait for the Opportunity Pipeline report page to load
	        // ...

	        System.out.println("Report Page with the Opportunities that are pipelined will be displayed.");
	        driver.close();
		}
	   




	//case18



	    // Wait for the Opportunities page to load
	    // ...

	    // Click on "Stuck Opportunities" link under Reports
	    WebElement stuckOpportunitiesLink = driver.findElement(By.linkText("Stuck Opportunities"));
	    stuckOpportunitiesLink.click();

	    // Wait for the Stuck Opportunities report page to load
	    // ...

	    System.out.println("Report Page with the Stuck Opportunities will be displayed.");






	//case19
	;

	    // Wait for the Opportunities page to load
	    // ...

	    // Click on "Quarterly Summary" link
	    WebElement quarterlySummaryLink = driver.findElement(By.linkText("Quarterly Summary"));
	    quarterlySummaryLink.click();

	    // Wait for the Quarterly Summary page to load
	    // ...

	    // Choose values for Interval and Include
	    WebElement intervalDropdown = driver.findElement(By.id("quarter_q"));
	    Select intervalSelect = new Select(intervalDropdown);
	    intervalSelect.selectByVisibleText("Current FQ");

	    WebElement includeDropdown = driver.findElement(By.id("open"));
	    Select includeSelect = new Select(includeDropdown);
	    includeSelect.selectByVisibleText("All");

	    // Click on Apply Filters button
	    WebElement applyFiltersButton = driver.findElement(By.xpath("//input[@title='Apply Filters']"));
	    applyFiltersButton.click();

	    // Wait for the report page to load
	    // ...

	    System.out.println("Report Page with the Opportunities that satisfies the search criteria will be displayed.");

}
}