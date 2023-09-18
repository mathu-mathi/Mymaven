package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	@FindBy(xpath="//div[@id='userNav']")
	public WebElement UserMenu;
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
	}

}
	}
	

}
