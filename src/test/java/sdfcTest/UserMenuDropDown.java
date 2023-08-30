package sdfcTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;
public class UserMenuDropDown extends Reusable
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
           Thread.sleep(3000);
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
            
            //Edit postlink
            Thread.sleep(3000);
            WebElement postLink = driver.findElement(By.id("PublisherAttachTextPost"));
            postLink.click();
            WebElement postiframe = driver.findElement(By.xpath("//iframe[cointains(@title,'Rich Text Editor,publisherRichTextEditor')]"));
            frame(driver,postiframe); 
            WebElement postBody=driver.findElement(By.xpath("//html[1]/body[1]"));
            postBody.click();
            enterText(postBody,"This is posted Text","PostText");
           
           
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




// Click on the Add Photo link
WebElement addPhotoLink = driver.findElement(By.xpath("//a[contains(@id, 'uploadLink')]"));
addPhotoLink.click();
driver.findElement(By.xpath("")).sendKeys("C:\\Users\\rames\\Downloads\\clement-helardot-95YRwf6CNw8-unsplash.jpg");


//Test 7
WebElement UserMenu=driver.findElement(By.xpath("//*[id='userNavButton']"));
UserMenu.click();
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
        WebElement email = driver.findElement(By.id("EmailSetup"));
        email.click();
        WebElement saveEmailSettingsButton = driver.findElement(By.id("EmailSettings_font"));
        saveEmailSettingsButton.click();     
      
        WebElement emailNameField = driver.findElement(By.id("sender_name"));
        emailNameField.clear();
        emailNameField.sendKeys("Mathu mathi Thangavel");
        WebElement emailAddressField = driver.findElement(By.id("sender_email"));
        emailAddressField.sendKeys("mathu2809@mca@gmail.com");
        emailAddressField.clear();
        WebElement autoBccRadio = driver.findElement(By.id("auto_bcc1"));
        autoBccRadio.click();
        saveEmailSettingsButton.click();

        // Click on "Calendar & Remainders" link
        WebElement calendarRemindersLink = driver.findElement(By.linkText("Calendar & Remainders"));
        calendarRemindersLink.click();
        Thread.sleep(3000);

        // Click on "Activity Remainders" link
        WebElement activityRemindersLink = driver.findElement(By.xpath("//*[@id='Remainders_font']"));
        activityRemindersLink.click();
        Thread.sleep(3000);

        // Click on "Open a Test Remainder" button
        WebElement openTestReminderButton = driver.findElement(By.className("testbtn"));
        openTestReminderButton.click();
        Thread.sleep(3000);
        
     //Test 8
        WebElement login=driver.findElement(By.xpath("//*[@id='Login']"));
        String actualTitle=driver.getTitle();
        driver.manage().window().maximize();
        String expectedTile="Home page Salesforce-Developer Edition";
        if(actualTitle.equalsIgnoreCase(expectedTile))
        {
        System.out.println("user on homepage");
        }
        else
        {
        	System.out.println("home page is not launched");
        	
        }
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
        
}

       



