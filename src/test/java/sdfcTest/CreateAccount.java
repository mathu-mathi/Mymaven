package sdfcTest;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount extends Reusable
{
	 //case 10create Account
    public  void Account() throws Exception
    {

	   	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Mathu@ram.com");
		driver.findElement(By.id("Password")).sendKeys("Admin@123");
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		driver.manage().window().maximize();
		String expected="Please enter the password.If you still can't log in,contact your administrator";
		String actual=driver.findElement(By.id("error")).getText();
		
		if(actual.equals(expected))
		{
         System.out.println("Matched");
		}
       else
        {
	System.out.println("failed");
	  }
		String errormsg=driver.findElement(By.xpath("//div[@id='error']")).getText();
		if(errormsg.equals("please check your username and password.If you still can't log in,contact your administrator"))
		{
			System.out.println("error is displayed");
		}
			else
				
			{
				System.out.println("error is not displayed");
			}
		// Click on New button to create a new account
    	 WebElement NewaccountsLink = driver.findElement(By.xpath("//*id='hotlist']/table/tbody/tr/td[2]/input"));
         NewaccountsLink.click();

         // Wait for the Accounts page to load
         // ...
         driver.findElement(By.linkText("Accounts")).click();
        
         // Enter Account name
        WebElement AccountName=driver.findElement(By.id("acc2"));
        AccountName.click();
        AccountName.sendKeys("Account");
         
         // Select type as Technology partner from the drop-down
         Select typeDropdown = new Select(driver.findElement(By.id("acc6")));
         typeDropdown.selectByVisibleText("Technology Partner");
         
         // Set customer priority as high
         Select priorityDropdown = new Select(driver.findElement(By.id("00N0o00000Fy314")));
         priorityDropdown.selectByVisibleText("High");
         
         // Click on Save button
         driver.findElement(By.name("save")).click();
         
         // Validate that the new account page is displayed with account details
         WebElement accountDetailsHeader = driver.findElement(By.xpath("//h2[contains(text(), '" + AccountName + "')]"));
         if (accountDetailsHeader.isDisplayed()) {
             System.out.println("New account page is displayed with account details.");
         } else {
             System.out.println("New account page is not displayed.");
         }
         //Test 11
         WebElement AccountsTab=driver.findElement(By.xpath("//*[id='Account_tab']/a"));
         AccountsTab.click();
       // Select the <view name> from the view drop-down list
         WebElement createNewViewLink = driver.findElement(By.linkText("Create New View"));
         createNewViewLink.click();

         // Enter View name and View unique name
         WebElement viewNameInput = driver.findElement(By.xpath("//input[contains(@id,'fname')]"));
         viewNameInput.clear();
         viewNameInput.sendKeys("ftff");
         String value=driver.findElement(By.xpath("//input[contains(@id,'fname')]")).getAttribute("value");
         System.out.println(value);

         WebElement viewUniqueNameInput = driver.findElement(By.xpath("//input[contains(@id,'devname')]"));
         viewUniqueNameInput.clear();
         viewUniqueNameInput.sendKeys("gcgf");
         String value1=driver.findElement(By.xpath("//input[contains(@id,'fname')]")).getAttribute("value1");
         System.out.println(value1);

         // Click on the Save button
         WebElement saveButton = driver.findElement(By.name("save"));
         saveButton.click();

         // Verify the new view is displayed in the account view list
         WebElement newView = driver.findElement(By.linkText("New View Name"));
         if (newView.isDisplayed()) {
             System.out.println("Newly added View is displayed in the account view list.");
         } else {
             System.out.println("Newly added View is not displayed in the account view list.");
         }

           WebElement viewDropdown = driver.findElement(By.id("fcf"));
         Select viewSelect = new Select(viewDropdown);
         viewSelect.selectByVisibleText("<view_name>");

         // Click on the Edit link for the selected view
         WebElement editLink = driver.findElement(By.linkText("Edit"));
         editLink.click();
//TEST 12
         
         // Wait for the Edit View page to load
         // ...

         // Change the view name to <new view name>
         WebElement EditLink=driver.findElement(By.linkText("Edit"));
         EditLink.click();
         WebElement viewNameField = driver.findElement(By.id("fname"));
         
         viewNameField.clear();
         enterText(viewNameField,"new_view_name","new_view_name");

         // Select filters
         WebElement filtersField = driver.findElement(By.id("fcol1"));
         filtersField.click();
         Select filtersSelect = new Select(filtersField);
         filtersSelect.selectByVisibleText("Account Name");

         WebElement operatorField = driver.findElement(By.id("fop1"));
         Select operatorSelect = new Select(operatorField);
         operatorSelect.selectByVisibleText("contains");

         WebElement valueField = driver.findElement(By.id("fval1"));
         valueField.click();
         valueField.sendKeys("<a>");

         // Select fields to display
         WebElement AvailableFields= driver.findElement(By.id("colselector_select_0"));
  
         

         // Click on Save button
         WebElement saveButton1 = driver.findElement(By.name("save"));
         saveButton1.click();

         // Wait for the View page to load with <new view name>
         // ...

         // Verify if the <new view name> is displayed in the drop-down
         WebElement newViewDropdown = driver.findElement(By.id("fcf"));
         Select newViewSelect = new Select(newViewDropdown);
         if (newViewSelect.getFirstSelectedOption().getText().equals("<new view name>")) {
             System.out.println("<new view name> is displayed in the drop-down.");
         } else {
             System.out.println("<new view name> is not displayed in the drop-down.");
         }

         // Verify the Last Activity column and account names
         // ..
    }
}
         // Wait for the Accounts page to load
         // ...

