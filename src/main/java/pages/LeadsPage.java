package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.FileConstants;
import utilis.CommonUtils;
import utilis.FileUtils;

public class LeadsPage {
	public LeadsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@title='Leads Tab']")
	public WebElement Leads;
	@FindBy(xpath="//select[@id='fcf']")
	public WebElement LeadSelect;
	@FindBy(xpath="//select[@id='fcf']")
	public WebElement view;
	@FindBy(css="#userNav-menuItems")
	public WebElement userMenu;
	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;
	@FindBy(xpath="//a[@title='Logout']")
	public WebElement logout;
	@FindBy(xpath="//span[@class='fBody']//input[@name='go']")
    public WebElement gobutton;
	@FindBy(xpath="//input[@title='New']")
	public WebElement New;
	@FindBy(xpath="//select[@id='lea13']")
	public WebElement LeadStatus;
	@FindBy(xpath="//input[@id='name_lastlea2']")
	public WebElement LastName;
	@FindBy(xpath="//input[@id='lea3']")
	public WebElement Company;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='save']")
	public WebElement SaveButton;
	
	public boolean selectLead() throws IOException {
		boolean isSelected = false;
		if (Leads.isDisplayed()) {
			Leads.click();
			isSelected = true;
		}
		return isSelected;
	}
public boolean verifyDropDown(WebDriver driver)
{
boolean isSelected=false;
if(LeadSelect.isSelected())
{
    List<WebElement> vw=view.getoptions;
	System.out.println(vw.size());
	for(int i=0;i<vw.size();i++)
	{
		System.out.println(vw.get(i).getText());
		isSelected=true;
	}
}
return isSelected;
}
public boolean selectLeads(WebDriver driver)
{
		boolean isSelected = false;
		if (view.isDisplayed()) {
			view.click();
			Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
			view.selectByIndex(1);
			
			isSelected = true;
		}
		return isSelected;

	}
	public boolean selectLogout(WebDriver driver,String sOption)
	{
			boolean isOptionSelected = false;
			if (userMenu.isDisplayed()) {
				userMenu.click();
			}
			WebElement userMenuItem = driver.findElement(By.xpath("//*[text()='" + sOption + "']"));
			if (userMenuItem.isDisplayed()) {
				userMenuItem.click();
				 logout.click();
				 driver.switchTo().parentFrame();
				isOptionSelected = true;
			}
			return isOptionSelected;
	}
public boolean selectgoButton(WebDriver driver)
{
	boolean isSelected = false;
	if (gobutton.isDisplayed()) {
		Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		view.selectByIndex(3);
		gobutton.click();
		isSelected = true;
	}
	return isSelected;
}
public boolean verifyTodayLeads(WebDriver driver)
{
	boolean isDisplayed=false;
	if(Leads.isDisplayed())
	{
		Leads.click();
		Select view = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		view.selectByIndex(3);
		if(LeadSelect.isDisplayed())
		{
	      LeadSelect.click();
	      isDisplayed=true;
		}
		
	}
	return isDisplayed;
}
public boolean selectNewButton(WebDriver driver)
{
	boolean isSelected = false;
	if (New.isDisplayed()) {
		New.click();
		isSelected = true;
	}
	return isSelected;
}
public boolean selectLeadStatus(WebDriver driver,String string)
		{
	boolean isSelected = false;
	if ( LeadStatus.isDisplayed()) {
		 LeadStatus.click();
		 
		isSelected = true;
	}
	return isSelected;
}
public boolean verifyLastName(WebDriver driver)
{
	boolean isSelected = false;
	if (LastName.isDisplayed()) {
		LastName.click();
		LastName.sendKeys("kiya");
		if(Company.isSelected())
		{
			Company.click();
			Company.sendKeys("rotii");
			SaveButton.click();
			}
		isSelected = true;
	}
	return isSelected;

	
}
	
}

