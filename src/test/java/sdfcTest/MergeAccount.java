package sdfcTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeAccount extends Reusable
{
     WebDriver driver;
	public static void main(String[] args) throws Exception
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
	//Test 13
	 WebElement AccountsTab=driver.findElement(By.xpath("//*[id='Account_tab']/a"));
     AccountsTab.click();
    // Click on Merge Accounts link in Tools area
    WebElement mergeAccountsLink = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
    mergeAccountsLink.click();

    // Wait for the Merge Accounts page to load
    // ...

    // Enter the <Account name> in the text box
    WebElement accountNameField = driver.findElement(By.id("srch"));
    accountNameField.clear();
    enterText(accountNameField,"Accounts","FindAccounts");

    // Click on Find accounts button
    WebElement findAccountsButton = driver.findElement(By.name("srchbutton"));
    findAccountsButton.click();

    // Wait for the search results
    // ...

    // Select the first two account links
    WebElement accountLink1 = driver.findElement(By.xpath("//input[@id='cido')"));
    RadioButton(accountLink1,"RadioButton");
    WebElement accountLink2 = driver.findElement(By.xpath("//input[@id='cid1')"));
    RadioButton(accountLink2,"RadioButton");
    WebElement accountLink3 = driver.findElement(By.xpath("//input[@id='cid2')"));
    RadioButton(accountLink3,"RadioButton");

    // Click on Next button
    WebElement nextButton = driver.findElement(By.xpath("//div[contains@class,'pbTopNButtons')]//input[contains(@title,'Next')]"));
    nextButton.click();

    // Wait for the Merge by Accounts step 2 page to load
    // ...

    // Click on Merge button
    WebElement mergeButton = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
    mergeButton.click();

    // Wait for the confirmation pop-up
    // ...

    // Click on OK button on the pop-up
    WebElement okButton = driver.findElement(By.xpath("//input[@value='OK']"));
    okButton.click();

    // Wait for the merged account page to load
    // ...

    // Verify the merged account in recently viewed view
    // ... 
        
//Test 14
    WebElement AccountsTab1=driver.findElement(By.xpath("//*[id='Account_tab']/a"));
    AccountsTab1.click();
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ESCAPE);
    r.keyPress(KeyEvent.VK_ESCAPE);
// Navigate to Accounts page
driver.findElement(By.linkText("Accounts")).click();

// Click on "Accounts with last activity > 30 days" link in reports area
driver.findElement(By.linkText("Accounts with last activity > 30 days")).click();

// Select create date in the date field drop down
WebElement dateDropdown = driver.findElement(By.id("ext-gen148"));
dateDropdown.click();
WebElement createdate=driver.findElement(By.xpath("//div[contains(text(), 'Created Date')]"));
createdate.click();

// Select "Today" in From and To fields
WebElement startdate=driver.findElement(By.name("startDate"));
startdate.click();
enterText(startdate,"8/14/2023","calender");
WebElement Enddate=driver.findElement(By.name("enddate"));
Enddate.click();
enterText(startdate,"8/26/2023","calender");


// Click on the save button on unsaved report page
driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();

// Provide report name and unique name
driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("<report name>");
driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys("<report unique name>");
Thread.sleep(3000);

// Click on save and run report button
driver.findElement(By.id("dlgSaveAndRun")).click();

// Validate that the report page with details and report name is displayed
String expectedReportName = "<report name>";
WebElement reportNameElement = driver.findElement(By.xpath("//div[contains(text(), '" + expectedReportName + "')]"));
if (reportNameElement.isDisplayed()) {
System.out.println("Report page with details and report name is displayed.");
} else {
System.out.println("Report page is not displayed.");
}
}

}
