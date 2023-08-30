package sdfcTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Contact extends Reusable
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
	//case 25
	WebElement contacts_menu_item =  driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]"));
	contacts_menu_item.click();

	//Click on "Create New View" hyperlink
	WebElement create_new_view_link = driver.findElement(By.xpath("//input[contain(@name='new')]"));
	create_new_view_link.click();

	//Fill in the required fields
	WebElement First_name_input = driver.findElement(By.xpath("//input[@id='name_firstcon2']")); //Replace with the actual ID
	First_name_input.sendKeys("Ashok");

	WebElement Last_name_input = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
	Last_name_input.sendKeys("Ramya");
	//AccountName
	WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
	AccountName.sendKeys("Software");
	// Save Button
	WebElement save=driver.findElement(By.xpath("//*[@id='bottomButtonRow']//input[@class='btn'])"));
	save.click();
	// Click Cancel button
	//WebElement cancel_button = driver.findElement(By.xpath(
	//cancel_button.click();

	//case 26

	WebElement contact_tab = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
	contact_tab.click();

	// Click on "Create New View" link
	WebElement createnewviewlink = driver.findElement(By.xpath("//a[contains(text(),'Create New View']"));
	createnewviewlink.click();

	// Fill in the View Name
	WebElement view_name_input = driver.findElement(By.xpath("//input[@id='fname']"));  // Replace with actual ID
	view_name_input.sendKeys("IDEA");

	// Fill in the View Unique Name 
	WebElement unique_name_input = driver.findElement(By.xpath("//input[@id='devname']"));  //Replace with actual ID
	unique_name_input.sendKeys("IDEA");

	// Click on the Save button
	WebElement save_button = driver.findElement(By.className("save")); //Replace with actual name or ID
	save_button.click();



	//case 27
	
	WebElement contacttab = driver.findElement(By.xpath("//*[@id='Contact_Tab']"));
	contacttab.click();
	
	// Select 'Recently created' from the drop-down list
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
	Thread.sleep(2000);
	

	// Switch back to the main content
	//driver.switch_to.default_content();
	
	//case 28

	
	
	//Select 'My Contacts' View from the drop-down list
	WebElement view_dropdown =driver.findElement(By.xpath("//label[@for='fcf']")); 
	Select select=new Select(view_dropdown);
	select.selectByVisibleText("My Contacts");
	WebElement go=driver.findElement(By.xpath("//input[@class='btn']"));
	go.click();
	
	//case 29
    // Click on a contact name in the Recent Contact Frame
	
	WebElement recent_contact_name = driver.findElement(By.xpath("//a[contains(text(),'tek1')]"));
	 recent_contact_name.click();
	

	//case 30
	
	// Click on "Create New View" hyperlink
	WebElement createNewviewlink= driver.findElement(By.xpath("//a[contains(text()='Create New View']"));
	createNewviewlink.click();

	//Switch to the Create New View iframe (if needed)
	//driver.switch_to.frame("iframe_id")  

	//Enter the View Unique Name
	WebElement uniqueNameinput = driver.findElement(By.xpath("//input[@id='devname']"));
	uniqueNameinput.sendKeys("Annu");

	// Click the Save button
	WebElement savebutton = driver.findElement(By.xpath("//input[@class='btn primary']"));
	savebutton.click();

	//case 31

		// Click on "Create New View" hyperlink
	create_new_view_link = driver.findElement(By.linkText("Create New View"));
	create_new_view_link.click();

// Enter the View Name
	WebElement viewnameinput = driver.findElement(By.name("fname"));
	viewnameinput.sendKeys("AMMA");

// Enter the View Unique Name
	WebElement uniquenameinput = driver.findElement(By.id("devname"));
	uniquenameinput.sendKeys("SAN");

	//Click the Cancel button
	WebElement cancel_button = driver.findElement(By.xpath("//*[@class='pbBottomButtons']//input[@title='cancel'])"));
	cancel_button.click();

	//case 32

	WebElement lastnameinput = driver.findElement(By.id("name_lastcon2"));
	lastnameinput.sendKeys("Indian");

    // Enter the Account Name
	WebElement accountnameinput = driver.findElement(By.xpath("//input[@id='con4']"));
	accountnameinput.sendKeys("Global Media");

	//Click the "Save & New" button
	WebElement savenewbutton = driver.findElement(By.xpath("//input[@title='Save & New']"));
	savenewbutton.click();

}
}
