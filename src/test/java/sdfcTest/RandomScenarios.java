package sdfcTest;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomScenarios extends Reusable
{

	public static void main(String[] args, Object newtab) throws Exception
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
	//case 33
	WebElement namelink = driver.findElement(By.linkText("FirstName LastName") ); 
	namelink.click();


	//case 34
	WebElement namelink1 = driver.findElement(By.linktext("FirstName LastName")); 
	namelink1.click();

	// Wait for the page to load
	WebDriverWait wait = WebDriverWait(driver, 10);
	WebElement user_menu_button = wait.until(EC.presence_of_element_located((By.ID, "user_menu_id")));
	//Click on the 'Edit Profile' icon near Contact
	WebElement editprofileicon = driver.findElement(by.xpath("//span[contains(@class, 'edit-profile')]") ); 
	editprofileicon.click();

	//Wait for the 'Edit Profile' popup to appear
	WebElement editprofilepopup = wait.until(EC.presenceof_element_located((By.ID, "edit_profile_popup_id")))  ;
	// Click on the 'About' tab in the popup
	WebElement abouttab = editprofilepopup.findElementby_xpath("//div[contains(@class, 'about-tab')]") ;
	abouttab.click();

	// Edit 'Last Name' field
	WebElement lastnamefield = editprofilepopup.findElement(by_id("last_name_id");  
	lastnamefield.clear();
	lastnamefield.sendKeys("Abcd");

	//Click Saveall button
	WebElementsave_all_button = edit_profile_popup.find_element_by_id("save_all_button_id")  # Replace with actual ID
	save_all_button.click()

	// Wait for the popup to close
	wait.until(EC.invisibility_of_element_located((By.ID, "edit_profile_popup_id")))

	//Verify updated LastName is displayed
	WebElementupdated_last_name_displayed = driver.find_element_by_xpath("//div[contains(@class, 'updated-last-name')]")  # Replace with actual xpath
	assert updated_last_name_displayed.text == "Abcd"

	//Verify updated LastName in the User menu
	user_menu_button.click()
	WebElementupdated_last_name_user_menu = wait.until(EC.presence_of_element_located((By.ID, "updated_last_name_user_menu_id")))  # Replace with actual ID
	assert updated_last_name_user_menu.text == "Abcd"

	//Verify updated LastName in the 'User:FirstName LastName' page
	driver.switch_to.window(driver.window_handles[-1])  # Switch to the 'User:FirstName LastName' window if it opened in a new tab
	WebElementupdated_last_name_user_page = wait.until(EC.presence_of_element_located((By.ID, "updated_last_name_user_page_id")))  # Replace with actual ID
	assert updated_last_name_user_page.text == "Abcd"

	
	// case 35
	WebElementplus_tab = driver.find_element_by_id("plus_tab_id")  # Replace with actual ID
	plus_tab.click()

	// Wait for the 'All Tabs' page to load
	wait = WebDriverWait(driver, 10)
			WebElementcustomize_my_tabs_button = wait.until(EC.presence_of_element_located((By.ID, "customize_my_tabs_button_id")))  # Replace with actual ID

	//Click on 'Customize My Tabs' button
	customize_my_tabs_button.click()

	//Wait for the 'Customize My Tabs' page to load
	WebElementselected_tab = wait.until(EC.presence_of_element_located((By.XPATH, "//div[contains(@class, 'selected-tab')]")))  # Replace with actual xpath

	//Select a tab from the 'Selected Tabs' section and click 'Remove'
	selected_tab.click()
	WebElementremove_button = driver.find_element_by_id("remove_button_id")  # Replace with actual ID
	remove_button.click()

	//Wait for the tab to move to the 'Available Tabs' section
	WebElementavailable_tab = wait.until(EC.presence_of_element_located((By.XPATH, "//div[contains(@class, 'available-tab')]")))  # Replace with actual xpath

	//Click on 'Save' button
	WebElementsave_button = driver.find_element_by_id("save_button_id")  # Replace with actual ID
	save_button.click()

	// Wait for the 'All Tabs' page to load
	WebElementwait.until(EC.presence_of_element_located((By.ID, "all_tabs_page_id")))  # Replace with actual ID

	//Click on the User menu and then Logout
	WebElementuser_menu = driver.find_element_by_id("user_menu_id")  # Replace with actual ID
	user_menu.click()
	WebElementlogout_button = driver.find_element_by_link_text("Logout")  # Replace with actual link text
	logout_button.click()

	
	//case 36

	WebElementcurrent_date_link = driver.find_element_by_link_text("Current Date")  # Replace with actual link text
	current_date_link.click()

	// Wait for the 'Calendar for FirstName LastName' page to load
	wait = WebDriverWait(driver, 10)
			WebElementeight_pm_link = wait.until(EC.presence_of_element_located((By.LINK_TEXT, "8:00PM")))  # Replace with actual link text

	//Click on '8:00PM' link
	eight_pm_link.click()

	//Wait for the 'Calendar: New Event' page to load
	WebElement wait.until(EC.presence_of_element_located((By.ID, "event_subject_id")))  # Replace with actual ID

	//Click on 'Subject Combo' icon
	WebElementsubject_combo_icon = driver.find_element_by_id("subject_combo_icon_id")  # Replace with actual ID
	subject_combo_icon.click()

	//Wait for the 'Combobox' popup to appear
	WebElementcombobox_popup = wait.until(EC.presence_of_element_located((By.ID, "combobox_popup_id")))  # Replace with actual ID

	//Click 'Other' from Combobox
	WebElementother_option = combobox_popup.find_element_by_link_text("Other")  # Replace with actual link text
	other_option.click()

	//Wait for the 'Combobox' popup to close
	wait.until(EC.invisibility_of_element_located((By.ID, "combobox_popup_id")))

	//Verify that 'Other' is entered in the Subject field
	WebElementsubject_field = driver.find_element_by_id("event_subject_id")  # Replace with actual ID
	assert subject_field.get_attribute("value") == "Other"

	//Click on the 'End' time field
	WebElementend_time_field = driver.find_element_by_id("event_end_time_id")  # Replace with actual ID
	end_time_field.click()

	//Wait for the dropdown to appear
	WebElementend_time_dropdown = wait.until(EC.presence_of_element_located((By.CLASS_NAME, "end-time-dropdown")))  # Replace with actual class name

	//Select '9:00 PM' from the dropdown
	WebElementnine_pm_option = end_time_dropdown.find_element_by_link_text("9:00 PM")  # Replace with actual link text
	nine_pm_option.click()

	//Click Save button
	WebElementsave_button = driver.find_element_by_id("save_button_id")  # Replace with actual ID
	save_button.click()

	//Wait for the 'Calendar for FirstName LastName' page to load
	wait.until(EC.presence_of_element_located((By.LINK_TEXT, "Other")))  # Replace with actual link text

	
	//37

	WebElementcurrent_date_link = driver.find_element_by_link_text("Current Date")  # Replace with actual link text
	current_date_link.click()

	// Wait for the 'Calendar for FirstName LastName' page to load
	wait = WebDriverWait(driver, 10)
			WebElementfour_pm_link = wait.until(EC.presence_of_element_located((By.LINK_TEXT, "4:00PM")))  # Replace with actual link text

	//Click on '4:00PM' link
	four_pm_link.click()

	//Wait for the 'Calendar: New Event' page to load
	WebElementwait.until(EC.presence_of_element_located((By.ID, "event_subject_id")))  # Replace with actual ID

	//Click on 'Subject Combo' icon
	WebElement	subject_combo_icon = driver.find_element_by_id("subject_combo_icon_id")  # Replace with actual ID
	subject_combo_icon.click()

	//Wait for the 'Combobox' popup to appear
	WebElementcombobox_popup = wait.until(EC.presence_of_element_located((By.ID, "combobox_popup_id")))  # Replace with actual ID

	//Click 'Other' from Combobox
	WebElementother_option = combobox_popup.find_element_by_link_text("Other")  # Replace with actual link text
	other_option.click()

	//Wait for the 'Combobox' popup to close
	wait.until(EC.invisibility_of_element_located((By.ID, "combobox_popup_id")))

	//Verify that 'Other' is entered in the Subject field
	WebElementsubject_field = driver.find_element_by_id("event_subject_id")  # Replace with actual ID
	assert subject_field.get_attribute("value") == "Other"

	//Click on the 'End' time field
	WebElementend_time_field = driver.find_element_by_id("event_end_time_id")  # Replace with actual ID
	end_time_field.click()

	//Wait for the dropdown to appear
	WebElementend_time_dropdown = wait.until(EC.presence_of_element_located((By.CLASS_NAME, "end-time-dropdown")))  # Replace with actual class name

	//Select '7:00 PM' from the dropdown
	WebElement	seven_pm_option = end_time_dropdown.find_element_by_link_text("7:00 PM")  # Replace with actual link text
	seven_pm_option.click()

	//Check 'Recurrence'
	WebElement	recurrence_checkbox = driver.find_element_by_id("recurrence_checkbox_id")  # Replace with actual ID
	recurrence_checkbox.click()

	//Verify 'Frequency', 'Start Date', 'End Date' sections are displayed
	wait.until(EC.presence_of_element_located((By.ID, "frequency_section_id")))
	wait.until(EC.presence_of_element_located((By.ID, "start_date_section_id")))
	wait.until(EC.presence_of_element_located((By.ID, "end_date_section_id")))

	//Select 'Weekly' radiobutton
	weekly_radio_button = driver.find_element_by_id("weekly_radio_button_id")  # Replace with actual ID
	weekly_radio_button.click()

	//Verify 'Recurs Every..' section and current day are displayed
	wait.until(EC.presence_of_element_located((By.ID, "recurs_every_section_id")))
	wait.until(EC.presence_of_element_located((By.XPATH, "//input[@id='current_day_checkbox_id' and @checked]")))

	//Click on the 'End Date' field
	end_date_field = driver.find_element_by_id("end_date_field_id")  # Replace with actual ID
	end_date_field.click()

	//Wait for the calendar to appear
	wait.until(EC.presence_of_element_located((By.CLASS_NAME, "calendar")))  # Replace with actual class name

	//Select 2 weeks from now
	end_date_picker = driver.find_element_by_class_name("end-date-picker")  # Replace with actual class name
	end_date_picker.find_element_by_link_text("2 weeks").click()

	//Wait for the calendar to close
	wait.until(EC.invisibility_of_element_located((By.CLASS_NAME, "calendar")))

	// Close the browser
	driver.quit();
	}

