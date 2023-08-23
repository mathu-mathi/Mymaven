package sdfcTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;
public class TestCase5<HasInputDevices> extends LoginTest
{
     static WebDriver driver;
        public  void userMenuAndMyProfile()
        {
        	try
        	{
            WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
            userMenu.click();

  

            // Click "My Profile" option(Test 6)
           // WebDriverWait wait=new WebDriverWait();
           
            WebElement myProfileOption = driver.findElement(By.linkText("My Profile"));
            myProfileOption.click();
            if (driver.getTitle().contains("User Profile")) 
            {
                System.out.println("User Profile page is displayed.");
            } 
            else 
            {
                System.out.println("User Profile page is not displayed.");
            }
            //Edit button option
            WebElement editButton = driver.findElement(By.xpath("//a[contains(@title, 'Edit Profile')]"));
            if (editButton.isDisplayed()) 
            {
                System.out.println("Edit button is displayed.");
                editButton.click();
            } else 
            {
                System.out.println("Edit button is not displayed.");
            }
            // changing last name
            driver.switchTo().frame("controltag");
            
            WebElement aboutTab = driver.findElement(By.xpath("//a[contains(@id, 'AboutTab')]"));
            if (aboutTab.isDisplayed())
            {
                System.out.println("About tab is displayed.");
            } else 
            {
                System.out.println("About tab is not displayed.");
            }
            
            WebElement lastNameField = driver.findElement(By.id("lastName"));
                       Actions actions = new Actions(driver);
            actions.click(lastNameField).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.DELETE).sendKeys("Thangavel").perform();
            WebElement saveAllButton = driver.findElement(By.xpath("//input[@value='Save All']"));
            saveAllButton.click();
            WebElement postLink = driver.findElement(By.linkText("Post"));
            postLink.click();

            // Locate the post text area and enter text
            WebElement postTextArea = driver.findElement(By.cssSelector("body.contenteditable"));
            postTextArea.sendKeys("Hello, this is my test post.");
            //Click on post link
           // WebElement postLink = driver.findElement(By.xpath("//a[contains(text(), 'Post')]")).click();
//WebElement postTextArea = driver.findElement(By.xpath("//textarea[contains(@id, 'publishereditablearea')]"));
            //WebElement postTextArea = driver.findElement(By.class("chatterPublisherRTE.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders.placeholder"));
//actions.click(postTextArea).sendKeys("Hello, this is a test post.");
           // driver.findElement(By.id("publisherAttachContentPost")).sendKeys("Hello, this is a test post");
            //WebElement bodyElement = driver.findElement(By.cssSelector("body.contenteditable"));
         //  String text = bodyElement.getText();
           // System.out.println("Text from the <body> element: " + text);
           // Click Share button
WebElement shareButton = driver.findElement(By.xpath("//input[@title='Share']"));
shareButton.click();

          // Upload a file
WebElement fileLink = driver.findElement(By.xpath("//a[contains(@title, 'File')]"));
fileLink.click();
WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"chatterUploadFileAction\"]"));
uploadButton.click();

// Find the "choose file" button and click it
WebElement chooseFileButton = driver.findElement(By.xpath("//input[@id=\"chatterFile\"]"));
chooseFileButton.sendKeys("\"C:\\Users\\rames\\OneDrive\\pictures\\Screenshots"); // Specify the path of the file you want to upload

// (Optional) Add some wait time to let the file upload
try {
    Thread.sleep(2000); // Wait for 2 seconds
} catch (InterruptedException e) {
    e.printStackTrace();
}

// Find the "open" button and click it
WebElement openButton = driver.findElement(By.xpath("XPATH_of_open_button"));
openButton.click();


// Click "Upload a File from Your Computer" button
//WebElement uploadFileButton = driver.findElement(By.xpath("//input[@title='Upload a File from Your Computer']"));
//uploadFileButton.click();
//WebElement browse = driver.findElement(By.xpath("//input[@id='chatterUploadFileAction']"));
//click on ‘Choose file’ to upload the desired file
//browse.sendKeys("C:\\Users\\rames\\OneDrive\\Pictures\\Screenshots\\q1.png"); //Uploading the file using sendKeys
//System.out.println("File is Uploaded Successfully");

  //driver.findElement(By.xpath("//*[@name,'chatterFile']")).sendKeys("C:\\Users\\rames\\OneDrive\\Pictures\\Screenshots");
//driver.findElement(By.xpath("//[@id=\"file upload\"]")).sendKeys("C:\\Users\\rames\\OneDrive\\Pictures\\Screenshots");
//WebElement profilePhoto = driver.findElement(By.xpath("//img[contains(@id, 'ProfilePhoto')]"));
//actions.moveToElement(profilePhoto).perform();

// Click on the Add Photo link
//WebElement addPhotoLink = driver.findElement(By.xpath("//a[contains(@id, 'uploadLink')]"));
//addPhotoLink.click();
//driver.findElement(By.xpath("")).sendKeys("C:\\Users\\rames\\Downloads\\clement-helardot-95YRwf6CNw8-unsplash.jpg");

//Specify the file input and open button patterns
//WebElement fileInput = driver.findElement(By.id("chatterFile"));

// Provide the path of the file you want to upload
//String filePath = "C:\\Users\\rames\\OneDrive\\Pictures\\Screenshots\\String Assignment"; // Replace with the actual file path

// Send the file path to the file input element
//fileInput.sendKeys(filePath);
//Test 7
    WebElement personalLink = driver.findElement(By.linkText("Personal"));
        personalLink.click();
        
        WebElement loginHistoryLink = driver.findElement(By.linkText("Login History"));
        loginHistoryLink.click();
        
        // Click on the "Download login history" link
        WebElement downloadLink = driver.findElement(By.linkText("Download login history for last six months, including logins from outside the Salesforce application"));
        downloadLink.click();
        
        // After download, you might need to handle the downloaded file

        // Go back to the My Settings page
        driver.navigate().back();

        // Click on the "Display & Layout" link
        WebElement displayLayoutLink = driver.findElement(By.linkText("Display & Layout"));
        displayLayoutLink.click();

        // Click on the "Customize My Tabs" link
        WebElement customizeTabsLink = driver.findElement(By.linkText("Customize My Tabs"));
        customizeTabsLink.click();

        // Select "Salesforce Chatter" from the custom app dropdown
        WebElement customAppDropdown = driver.findElement(By.id("p4"));
        customAppDropdown.sendKeys("Salesforce Chatter");

        // Select "Reports" tab from Available Tabs and click "(Add)"
        WebElement availableTabsList = driver.findElement(By.id("duel_select_0"));
        WebElement reportsTab = availableTabsList.findElement(By.xpath("//option[text()='Reports']"));
        WebElement addButton = driver.findElement(By.xpath("//img[@title='Add']"));

        reportsTab.click();
        addButton.click();

        // Click on "Save"
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();

        // Click on the "Email" link and then "My Email Settings"
        WebElement emailLink = driver.findElement(By.linkText("Email"));
        emailLink.click();

        WebElement emailSettingsLink = driver.findElement(By.linkText("My Email Settings"));
        emailSettingsLink.click();

        // Enter email details and click "Save"
        WebElement emailNameField = driver.findElement(By.id("sender_name"));
        WebElement emailAddressField = driver.findElement(By.id("sender_email"));
        WebElement autoBccRadio = driver.findElement(By.id("auto_bcc1"));
        WebElement saveEmailSettingsButton = driver.findElement(By.name("save"));

        emailNameField.clear();
        emailNameField.sendKeys("Mathu mathi Thangavel");
        emailAddressField.clear();
        emailAddressField.sendKeys("mathu2809@mca@gmail.com");
        autoBccRadio.click();
        saveEmailSettingsButton.click();

        // Click on "Calendar & Remainders" link
        WebElement calendarRemindersLink = driver.findElement(By.linkText("Calendar & Remainders"));
        calendarRemindersLink.click();

        // Click on "Activity Remainders" link
        WebElement activityRemindersLink = driver.findElement(By.linkText("Activity Reminders"));
        activityRemindersLink.click();

        // Click on "Open a Test Remainder" button
        WebElement openTestReminderButton = driver.findElement(By.name("testbtn"));
        openTestReminderButton.click();
     //Test 8

WebElement developerConsoleLink = driver.findElement(By.linkText("Developer Console"));
developerConsoleLink.click();

// Switch to the new window (Developer Console)
for (String windowHandle : driver.getWindowHandles()) {
    driver.switchTo().window(windowHandle);
}

// Close the Developer Console
driver.close();

// Switch back to the main window
driver.switchTo().defaultContent();
//Test 9
// Click on "Logout" option
WebElement logoutOption = driver.findElement(By.linkText("Logout"));
logoutOption.click();
Thread.sleep(3000);

// Wait for the logout to complete and verify the URL
if (driver.getCurrentUrl().equals("https://login.salesforce.com/")) {
    System.out.println("Logout successful.");
} else {
    System.out.println("Logout failed.");
}
        	}
catch(Exception e)
{
}
}
        //case 10create Account
        public  void Account()
        {
        	 WebElement accountsLink = driver.findElement(By.linkText("Accounts"));
             accountsLink.click();

             // Wait for the Accounts page to load
             // ...
             driver.findElement(By.linkText("Accounts")).click();
             
             // Click on New button to create a new account
             driver.findElement(By.name("new")).click();
             
             // Enter Account name
     String accountName = "M";
            // driver.findElement(By.id("acc2"));
            WebElement element =  driver.findElement(By.id("acc2"));
            
            Actions action1 = new Actions(driver);
            action1.moveToElement(element).click().perform();
            action1.sendKeys("Ellil");
             
             // Select type as Technology partner from the drop-down
             Select typeDropdown = new Select(driver.findElement(By.id("acc6")));
             typeDropdown.selectByVisibleText("Technology Partner");
             
             // Set customer priority as high
             Select priorityDropdown = new Select(driver.findElement(By.id("00N6g00000MGt4I")));
             priorityDropdown.selectByVisibleText("High");
             
             // Click on Save button
             driver.findElement(By.name("save")).click();
             
             // Validate that the new account page is displayed with account details
             WebElement accountDetailsHeader = driver.findElement(By.xpath("//h2[contains(text(), '" + accountName + "')]"));
             if (accountDetailsHeader.isDisplayed()) {
                 System.out.println("New account page is displayed with account details.");
             } else {
                 System.out.println("New account page is not displayed.");
             }
             //Test 11
           // Select the <view name> from the view drop-down list
             WebElement createNewViewLink = driver.findElement(By.linkText("Create New View"));
             createNewViewLink.click();

             // Enter View name and View unique name
             WebElement viewNameInput = driver.findElement(By.xpath("//input[contains(@id,'fname')]"));
             viewNameInput.sendKeys("New View Name");

             WebElement viewUniqueNameInput = driver.findElement(By.xpath("//input[contains(@id,'devname')]"));
             viewUniqueNameInput.sendKeys("New_View_Unique_Name");

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
             WebElement viewNameField = driver.findElement(By.id("fname"));
             
             viewNameField.clear();
             viewNameField.sendKeys("new_view_name");

             // Select filters
             WebElement filtersField = driver.findElement(By.id("fcol1"));
             Select filtersSelect = new Select(filtersField);
             filtersSelect.selectByVisibleText("Account Name");

             WebElement operatorField = driver.findElement(By.id("fop1"));
             Select operatorSelect = new Select(operatorField);
             operatorSelect.selectByVisibleText("contains");

             WebElement valueField = driver.findElement(By.id("fval1"));
             valueField.sendKeys("a");

             // Select fields to display
             WebElement fieldsToDisplay = driver.findElement(By.id("colselector_select_0"));
             fieldsToDisplay.click();

             // Click on Save button
             WebElement saveButton = driver.findElement(By.name("save"));
             saveButton.click();

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
try
{
             // Wait for the Accounts page to load
             // ...
//Test 13
             // Click on Merge Accounts link in Tools area
             WebElement mergeAccountsLink = driver.findElement(By.linkText("Merge Accounts"));
             mergeAccountsLink.click();

             // Wait for the Merge Accounts page to load
             // ...

             // Enter the <Account name> in the text box
             WebElement accountNameField = driver.findElement(By.id("srch"));
             accountNameField.sendKeys("<Account name>");

             // Click on Find accounts button
             WebElement findAccountsButton = driver.findElement(By.name("srchbutton"));
             findAccountsButton.click();

             // Wait for the search results
             // ...

             // Select the first two account links
             WebElement accountLink1 = driver.findElement(By.xpath("//table[@class='list']/tbody/tr[1]/td[1]/input"));
             WebElement accountLink2 = driver.findElement(By.xpath("//table[@class='list']/tbody/tr[2]/td[1]/input"));
             accountLink1.click();
             accountLink2.click();

             // Click on Next button
             WebElement nextButton = driver.findElement(By.name("goNext"));
             nextButton.click();

             // Wait for the Merge by Accounts step 2 page to load
             // ...

             // Click on Merge button
             WebElement mergeButton = driver.findElement(By.name("save"));
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

         } catch (Exception e) {
             e.printStackTrace();
         } finally {
         }
                 
  //Test 14
     
     // Navigate to Accounts page
     driver.findElement(By.linkText("Accounts")).click();
     
     // Click on "Accounts with last activity > 30 days" link in reports area
     driver.findElement(By.linkText("Accounts with last activity > 30 days")).click();
     
     // Select create date in the date field drop down
     WebElement dateDropdown = driver.findElement(By.id("ext-gen16"));
     dateDropdown.click();
     
     // Select "Today" in From and To fields
     driver.findElement(By.xpath("//div[contains(text(), 'Today')]")).click();
     
     // Click on the save button on unsaved report page
     driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
     
     // Provide report name and unique name
     driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("<report name>");
     driver.findElement(By.id("saveReportDlg_DeveloperName")).sendKeys("<report unique name>");
     
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







