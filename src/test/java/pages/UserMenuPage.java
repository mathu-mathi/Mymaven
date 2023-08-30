package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.profiler.model.Profile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.WaitConstant;
import utils.CommonUtils;
import utils.FileUtils;

/**
 * @author rames
 *
 */
public class UserMenuPage extends BasePage
{
	public UserMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=("//div[@id='userNav']"))
	public WebElement userMenu;
	
	@FindBy(xpath="//div[@id='userNav-menuitems']/a")
	public List<WebElement> userMenuOptions;
	
	@FindBy(id="userNav-menuitems/a[1]")
	public WebElement MyProfile;
	
	@FindBy(id="userNav-menuitems/a[2]")
	public WebElement MySettings;
	
	@FindBy(id="userNav-menuitems/a[3]")
	public WebElement DevelopersConsole;
	
	@FindBy(id="userNav-menuitems/a[4]")
	public WebElement SwitchtoLightningExperience;
	
	@FindBy(id="userNav-menuitems/a[5]")
	public WebElement Logout;
	
	//My profile
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink")
	public WebElement editContactButton;
	
	@FindBy(xpath="//div/h2[@id='contactInfoTitle')")
	public WebElement EditProfilePopupwindow;
	
	@FindBy(id="aboutTab")
	public WebElement Abouttab;
	
	@FindBy(xpath="//input[@id='lastName')")
	public WebElement Abouttablastname;
	
	@FindBy(xpath="//*[@value='Save All')")
	public WebElement saveAllButton;
	
	@FindBy(xpath="//*[@id=\"tailBreadcrumbNode\"]")
	public WebElement UserProfilepagenamedisplay;
	
//post link
	@FindBy(css="#publishereditablearea")
	public WebElement postLink;
	
	@FindBy(xpath="/html/body")
	public WebElement postTextArea;
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	public WebElement shareButton;
	// file link
	@FindBy(id="//*[@id='publisherAttachContentPost']")
	public WebElement filelink;
	@FindBy(xpath="//a[@id='publisherAttachContentPost']/span[1]")
	public WebElement contentpost;
	
	@FindBy(css="#chatterUploadFileAction")
	public WebElement Uploadfile;
	
	@FindBy(css="chatterFile")
	 public WebElement Fileopen;
	
	@FindBy(css="#publishersharebutton")
	public WebElement publish;
	
	@FindBy(xpath="//input[@value='cancel Upload']")
	public WebElement cancelUpload;
	
	@FindBy(id="uploadLink")
	public WebElement updateButton;
	//photo link
	@FindBy(xpath="//*[@id=\"publisherAttachLinkPost\"]/span[1]")
	public WebElement photolink ;
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	public WebElement uploadphoto;
	@FindBy(name="j_id0:uploadFileForm:uploadBtn")
	public WebElement uploadbutton;
	@FindBy(id="uploadPhotoContentId")
	public WebElement photoUploadIframe;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']")
	public WebElement photoSaveButton;
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']")
	public WebElement photoSaveButton2;
	//My Settings
	//personallink
	@FindBy(xpath="//input[@id=\'PersonalInfo_font\']")
	public WebElement personallink;
	@FindBy(xpath="//input[@id=\"LoginHistory_font']")
	public WebElement loginHistorylink;
	@FindBy(id="publishersharebutton")
	public WebElement publishersharebutton;
	@FindBy(xpath="//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
	public WebElement logindisplay;
	@FindBy(id="contactInfoContentId")
	public WebElement iframeAboutTab;
	
     
	//Dispaly&layout link
	@FindBy(xpath="//*[@id=\"DisplayAndLayout_font\"]")
	public WebElement DisplayLayoutlink;
	@FindBy(id="CustomizeTabs_font")
	public WebElement CustomizedTab;
	@FindBy(xpath="//*[@id=\"p4\"]/option[9]")
	public WebElement customApp ;
	@FindBy(xpath="//*[@id=\"duel_select_0\"]/option[73]")
	public WebElement Availabletab;
	@FindBy(xpath="//*[@id=\"due1_select_0_right\"]/img")
	public WebElement Add;
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement save;
	@FindBy(id="tabBar")
	public WebElement tabList;
	//Email link
	@FindBy(xpath="//*[@id=\"EmailSetup_font\"]")
	public WebElement EmailLink;
	@FindBy(id="EmailSettings_font")
	public WebElement MyEmailSettings;
	@FindBy(id="sender_name")
	public WebElement Emailname;
	@FindBy(xpath="//*[@id=\"sender_email\"]")
	public WebElement Emailaddress;
	@FindBy(xpath="//*[@id=\"useremailSection\"]/table/tbody/tr[7]/td[2]/div")
	public WebElement BCCradiobutton;
	@FindBy(id="profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;
	@FindBy(id="contactTab")
	public WebElement contactTab;
	@FindBy(id="AboutTab")
	public WebElement AboutTab;
	
	
	
	/**
	 * @param driver
	 * @param sOption
	 * @return
	 */
	public boolean selectOptionFromUserMenuOptions(WebDriver driver,String sOption)
	{
		boolean isOptionSelected=false;
		if(userMenu.isDisplayed())
		{
			userMenu.click();
		}
		WebElement userMenuItem=driver.findElement(By.xpath("//*text(),'"+sOption+"']"));
		if(userMenuItem.isDisplayed()) {
			userMenuItem.click();
			isOptionSelected=true;
		}
		return isOptionSelected;
		
		}
    public boolean verifyUserMenuItems() throws IOException
    {
    	boolean isOptionVerified=true;
    	String[] expectedUserMenuItems=FileUtils.readUserMenuTestData("usermenu.items").split(",");
    	for(int i=0;i<expectedUserMenuItems.length;i++)
    	{
    		String actualOption=userMenuOptions.get(i).getText();
    		if(expectedUserMenuItems[i].equals(actualOption))
    		{
    			System.out.println("Expected Option"+ expectedUserMenuItems[i]+"Actual Option"+actualOption);
    		}
    		else
    		{
    			System.out.println("Expected Option"+ expectedUserMenuItems[i]+"failed to match with Actual Option"+actualOption);
    			isOptionVerified=false;
    		}
    	}
    	return isOptionVerified; 
    }
    public boolean selectMyProfile(WebDriver driver)
    {
    	return this.selectOptionFromUserMenuOptions(driver, "My profile");
    }
    public boolean isProfilePageVisible()
    {
    	return profilePage.isDisplayed();
    }
    public void selecteditContact(WebDriver driver)
    {
    if(CommonUtils.WaitForElement(driver, editContactButton))
    {
    	editContactButton.click();
    }
    }
    public boolean verifyEditContactPopup(WebDriver driver)
    {
    	boolean isContactPopUpVerified=false;
    	if(CommonUtils.WaitForElement(driver, iframeAboutTab))
    	{
    		driver.switchTo().frame(iframeAboutTab);
    	if(AboutTab.isDisplayed()&&contactTab.isDisplayed())
    	{
    		isContactPopUpVerified=true;	
    	}
    }
    
    return isContactPopUpVerified;
    }
public boolean verifyLastNameChangeInAboutTab(WebDriver driver,String sLastName)
{
	boolean isLastNameVerified=false;
	if(AboutTab.isDisplayed())
	{
		AboutTab.click();
		Abouttablastname.clear();
		Abouttablastname.sendKeys(sLastName);
		saveAllButton.click();
		driver.switchTo().parentFrame();
		if(UserProfilepagenamedisplay.isDisplayed())
		{
			String sActualName=UserProfilepagenamedisplay.getText();
			if(sActualName.contains(sLastName)) {
				isLastNameVerified=true;
			}
		}
		else
		{
			System.out.println("UserMenuPage:About tab is not visible");
		}
	}
	return isLastNameVerified;
}
public boolean verifyFileUpload(WebDriver driver,String sFilePath, WebElement verifyFilePostElement) throws InterruptedException
{
	boolean isFileUploadSuccess=false;
	if(CommonUtils.WaitForElement(driver, filelink))
	{
		filelink.click();
		if(CommonUtils.WaitForElement(driver,Uploadfile))
		{
			Uploadfile.click();
		}
	if(CommonUtils.WaitForElement(driver,Fileopen))
	{
		Fileopen.sendKeys(sFilePath);
		shareButton.click();
		Thread.sleep(WaitConstant.WAIT_FOR_UPLOAD_TO_FINISH);
		if(CommonUtils.WaitForElementDisappear(driver, cancelUpload))
		{
			if(verifyFilePostElement.isDisplayed())
			{
				isFileUploadSuccess=true;
			}
		}
		
		}
	}
	return isFileUploadSuccess;
}
	public void clickOnUpdatePhoto(WebDriver driver)
	{
		CommonUtils.moveToElement(driver, moderatorButton);
		if(updateButton.isDisplayed())
		{
			updateButton.click();
		}
	}
	public boolean verifyPhotoUpload(WebDriver driver, String profilePhotoFilePath) throws InterruptedException
	{
		boolean isUploadSuccess=false;
		clickOnUpdatePhoto(driver);
		driver.switchTo().frame(photoUploadIframe);
		if(CommonUtils.WaitForElement(driver, uploadphoto))
		{
			uploadphoto.sendKeys(profilePhotoFilePath);
			photoSaveButton.click();
			Thread.sleep(4000);
		}
		if(CommonUtils.WaitForElement(driver, photoSaveButton2))
		{
			 photoSaveButton2.click();
				Thread.sleep(4000);
				isUploadSuccess=true;
				
		}
		driver.switchTo().parentFrame();
		return isUploadSuccess;
	}
	public boolean verifyCreatePost(WebDriver driver, String sMessageToPost) throws InterruptedException {
		if(CommonUtils.WaitForElement(driver, postLink))
		{
			postLink.click();
			driver.switchTo().frame(0);
			postTextArea.sendKeys(sMessageToPost);
			driver.switchTo().parentFrame();
			if(shareButton.isDisplayed())
			{
				shareButton.click();
				Thread.sleep(3000);
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
}