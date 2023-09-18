package pages;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tests.BaseTest;

public class Opportunities extends BaseTest {

	public static final String Logout = null;

	public Opportunities(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//li[@id='Opportunity_Tab']")
	public WebElement Opportunities;
	@FindBy(xpath="//input[contains(@title,'New')]")
	public WebElement Newbutton;
	@FindBy(id="opp3")
	public WebElement oppname;
	@FindBy(xpath="//input[@id='opp4']")
	public WebElement nameopp;
	@FindBy(xpath="//img[@title='Account Name Lookup(New Window)']")
	public WebElement LookupWindow;
	@FindBy(id="1ksrch")
	public WebElement search;
	@FindBy(xpath="//input[@name='go'}")
	public WebElement name;
	@FindBy(xpath="//tr[@class='dataRow even last first']/th/a/")
	public WebElement lastfirst;
	@FindBy(xpath="//input[@id='opp9']")
	public WebElement opp;
	@FindBy(xpath="//a[@class='calToday']")
	public WebElement today;
	@FindBy(xpath="//select[@id='opp11']")
	public WebElement stage;
	@FindBy(xpath="//input[@id='opp12']")
	public WebElement createnew;
	@FindBy(xpath="//a[contains(text(),'Opportunity Pipeline']")
	public WebElement opppipeline;
	@FindBy(xpath="//a[contains(text(),'Stuck Opportunities']")
	public WebElement Stuckopp;
	@FindBy(xpath="//select[@id='quater_q']")
	public WebElement Interval;
	@FindBy(xpath="//select[@id='quater_q']")
	public WebElement dropdown;
	@FindBy(xpath="//select[@id='open']")
	public WebElement include;
	@FindBy(xpath="//select[@id='open']")
	public WebElement dropdown1;
	@FindBy(xpath="//input[@title='Run Report']")
	public WebElement RunReport;
	
	public boolean selectOpportunities(WebDriver driver, String sOption) {
		boolean isOptionSelected = false;
		if (Opportunities.isDisplayed()) {
			Opportunities.click();
		    isOptionSelected = true;
		}
		return isOptionSelected;
	}
	public boolean oppName(WebDriver driver)
	{
		boolean isSelected=false;
		if(Opportunities.isSelected())
		{
			Newbutton.click();
			if(Newbutton.isDisplayed())
			{
				oppname.clear();
				oppname.sendKeys("HYUI");
				nameopp.clear();
				nameopp.sendKeys("JKIL123");
						isSelected=true;
			}
		}
		{
			
		}
		return isSelected;
	}
public boolean lookUpWindow(WebDriver driver)
{
boolean isSelected=false;
if(LookupWindow.isSelected())
{
	LookupWindow.click();
	String oldWindow=driver.getWindowHandle();
	Set<String>getAllWindows=driver.getWindowHandles();
	String[] getWindow=getAllWindows.toArray(new String[getAllWindows.size()]);
	driver.switchTo().window(getWindow[1]);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.switchTo().frame("searchFrame");
	search.sendKeys("hgsfhg65");
	name.click();
	 isSelected=true;
}
return isSelected;
}
public boolean originalWindow(WebDriver driver)
{
	boolean isDisplayed=false;
	if( today.isDisplayed())
	{
		today.click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		stage.click();
		if(stage.isDisplayed())
		{
			Select dropdown=new Select(stage);
			dropdown.selectByValue("Qualification");
			createnew.sendKeys("98");
			isDisplayed=true;
		}
	}
	return isDisplayed;
}

	public boolean pipeLine(WebDriver driver)
	{
		if (Opportunities.isDisplayed()) {
			Opportunities.click();
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(opppipeline.isDisplayed())
			{
				opppipeline.click();
				Stuckopp.click();
			}
		}
		return false;	
	}
	public boolean verifyRunReport(WebDriver driver)
	{
		if (Opportunities.isDisplayed()) {
			Opportunities.click();
			Interval.click();
			if(dropdown.isDisplayed())
			{
				Select drop=new Select(dropdown);
				drop.selectByVisibleText("Next FQ");
				 include.click();
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 Select drop1=new Select(dropdown1);
				 drop1.selectByVisibleText("Open Opportunities");
				 if(dropdown1.isDisplayed())
				 {
					 RunReport.click(); 
				 }
			}
		}
		return false;
	
	}
}
