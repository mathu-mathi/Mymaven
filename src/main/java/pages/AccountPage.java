package pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilis.CommonUtils;

public class AccountPage extends BasePage
{

	public AccountPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//*[@id='Account_tab']")
	public  WebElement Accounts_tab;
	@FindBy(xpath="//*[@id='hotlist']/table/tbody/tr/td[2]/input")
	public WebElement newAccount;
	@FindBy(id="acc2")
	public WebElement AccountName;
	@FindBy(xpath="//select[@id='acc6']")
	public WebElement selecttype;
	@FindBy(xpath="select[@id='00N0o00000Fy314']")
	public WebElement priority;
	@FindBy(name="save")
	public WebElement save;
	@FindBy(xpath="//*[@id='filter_element']/div/span/span[2]/a[2]")
	public WebElement createNewview;
	@FindBy(xpath="//*[@id='fname']")
	public WebElement viewName;
	@FindBy(xpath="//*[@id='devname']")
	public WebElement viewUniqueName;
	@FindBy(xpath="//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]")
	public WebElement Save;
	@FindBy(className="title")
	public WebElement dropdown;
	@FindBy(xpath="//select[@id='fcf']")
	public WebElement view;
	@FindBy(linkText="Edit")
	public WebElement EditLink;
	@FindBy(xpath="//select[@id='fcol1']")
	public WebElement firstcolumn;
	@FindBy(xpath="//select[@id='fcol1']")
	public WebElement fields;
	@FindBy(xpath="//select[@id='fcol1']")
	public WebElement AddfieldsOperator;
	@FindBy(id="fval1")
	public WebElement value;
	@FindBy(xpath="//*[@id='colselector_select_0']")
	public WebElement AvailableFields;
	@FindBy(xpath="//img[@class='rightArrowIcon']")
	public WebElement AddArrow;
	@FindBy(name="save")
	public WebElement save_button;
	@FindBy(xpath="//a[contains(text(),'MergeAccounts']")
	public WebElement Mergeaccount;
	@FindBy(id="srch")
	public WebElement fb;
	@FindBy(name="srchbutton")
	public WebElement Findaccount;
	@FindBy(xpath="//input[@id='cid0']")
	public WebElement Button1;
	@FindBy(xpath="//input[@id='cid1']")
	public WebElement Button2;
	@FindBy(xpath="//input[@id='cid2']")
	public WebElement Button3;
	@FindBy(xpath="//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]")
	public WebElement Next;
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Merge']")
	public WebElement Merge;
	@FindBy(xpath="//a[contains(text(),'Accounts with last activity>30 dsys'{]")
    public WebElement LastActivity;
    @FindBy(xpath="//img[@id='ext-gen148']")
    public WebElement dropdown1;
    @FindBy(xpath="//div[contains(text(),'CreatedDte']")
    public WebElement createdate;
    @FindBy(name="startDate")
    public WebElement startdate;
    @FindBy(name="endDate")
    public WebElement enddate;
    @FindBy(xpath="//button[@id='ext-gen49']")
    public WebElement savecalender;
    @FindBy(name="reportName")
    public WebElement Reportnames;
    @FindBy(id="saveReportDlg_DeveloperName")
    public WebElement ReportUniName;
    @FindBy(id="dlgSaveAndRun")
    public WebElement Saveandrun;
    
    public boolean selectAccount(WebDriver driver, String sOption) {
		boolean isOptionSelected = false;
		if (Accounts_tab.isDisplayed()) {
			Accounts_tab.click();
		}
		WebElement Accounts_tab = driver.findElement(By.xpath("//*[@id='Account_tab']"));
		if (Accounts_tab.isDisplayed()) {
			Accounts_tab.click();
			isOptionSelected = true;
		}
		return isOptionSelected;
	}

    public boolean newAccount(WebDriver driver)
    {
    	boolean isSelected=false;
		if ( newAccount.isDisplayed()) {
			 newAccount.click();
			if (AccountName.isDisplayed()) {
				isSelected=true;
			}
		}
		return isSelected;
    	
    }
		public boolean CreateAccount(WebDriver driver )throws InterruptedException {
			boolean createAccount = false;
			if (CommonUtils.waitForElement(driver, Accounts_tab)) {
				Accounts_tab.click();
				if (selecttype.isDisplayed()) {
					selecttype.click();
					Select select=new Select(selecttype);
					select.selectByVisibleText("Technology Partner");
          			Thread.sleep(2000);
				if(priority.isSelected())
				{
					priority.click();
					select.selectByVisibleText("High");
				}
				}
				createAccount = true;			
			}
			return createAccount;
		}
		public boolean verifyCreatenewView(WebDriver driver)
		{
			boolean isOptionSelected = false;
			if (Accounts_tab.isDisplayed())
			{
				Accounts_tab.click();
				}
			if(createNewview.isDisplayed())
			{createNewview.click();
			isOptionSelected=true;
			}
		return isOptionSelected;
		}
      public boolean createViewNmae(WebDriver driver,String view)
      {
      boolean verifynewview=true;
      if(viewName.isSelected())
      {
    	  viewName.clear();
    	  viewName.sendKeys("rrrr");
      }
    	  if(viewUniqueName.isSelected())
    	  {
    		  viewUniqueName.clear();
    		  viewUniqueName.sendKeys("re");
    		  verifynewview=false;
    	  }
		return verifynewview;
      }
      public boolean clickOnSaveButton(WebDriver driver) {
  		CommonUtils.moveToElement(driver,Save);
  		if (Save.isDisplayed()) {
  			Save.click();
  		}
		return false;
  	}


public boolean selectDropdown(WebDriver driver)
{
	boolean isDisplayed=false;
			if(createNewview.isDisplayed())
			{createNewview.click();
			 if(viewName.isSelected())
		      {
		    	  viewName.clear();
		    	 Select droppdown=new Select(selecttype);
		    	 droppdown.selectByIndex(1);
		    	 boolean isDispalyed=true;
		  
		      }
			}
			return isDisplayed;
}
public boolean changeViewNmae(WebDriver driver,String view)
{
	if( EditLink.isSelected()) 
	{
		EditLink.click();
		viewName.clear();
		viewName.sendKeys("hdhf");
		
	}
	return false;
}
	
	  public boolean changeViewSettings(String newViewName, String filterField, String operator, String filterValue, String displayFields) {
		 boolean isDisplayed=false;
{
			  if(Accounts_tab.isDisplayed())
{
		  firstcolumn.sendKeys("column");
		  Select accfield=new Select(selecttype);
		  accfield.selectByIndex(1);
		  Select AddfieldsOperator=new Select(selecttype);
		  AddfieldsOperator.selectByIndex(3);
		  if(value.isSelected())
		  {
			  value.clear();
			  value.sendKeys("<a>");
			     isDisplayed=true;
		  }
}
}
return isDisplayed;
	  }
public boolean availableDropdown(WebDriver driver)
{
	boolean Elemetavailable =false;
	if(AvailableFields.isDisplayed())
	{
		Select AvailableFields_list=new Select(AvailableFields);
		List<WebElement>AvailableField_option= AvailableFields_list.getOptions();
	for(int i=0; i<AvailableField_option.size();i++)
	{
		if(AvailableField_option.get(i).getText().equals("Last Activity"))
		{
			AddArrow.click();
			Elemetavailable =true;
			
		}

}
	}
	return Elemetavailable;
}
public boolean clickSaveButton(WebDriver driver)
{
		CommonUtils.moveToElement(driver,Save);
		if (save_button.isDisplayed()) {
			save_button.click();
		}
	return false;
	}
public boolean mergeAccount(WebDriver driver)
{
	boolean isOptionSelected = false;
	if (Accounts_tab.isDisplayed())
	{
		Accounts_tab.click();
		if(Mergeaccount.isSelected())
		{
			Mergeaccount.click();
			fb.clear();
			fb.sendKeys("find");
			isOptionSelected = false;
			
		}
		}
	return isOptionSelected;
		}
public boolean selectFirstTwoAccounts(WebDriver driver)
{
boolean isOptionSelected=false;
	if(Mergeaccount.isSelected())
	{
		Button1.click();
		Button2.click();
		Button3.click();
		Next.click();
		if(Next.isSelected())
		{
			Merge.click();
			isOptionSelected=false;
			switchtoAlert(driver);
		}
		}
	return isOptionSelected;
	}

private void switchtoAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
	// TODO Auto-generated method stub
	
}
	
public boolean  selectDropdownDate(WebDriver driver)
{
	boolean isOptionSelected = false;
	if (Accounts_tab.isDisplayed())
	{
		Accounts_tab.click();
		LastActivity.click();
if(dropdown1.isDisplayed())
{
	dropdown1.click();
	System.out.println("pass");
	 createdate.click();
	 startdate.click();
	 enddate.click();
	}
	else
	{
		System.out.println("fail");
	}

}
	return isOptionSelected;
}
public boolean Savecalender(WebDriver driver)
{
	CommonUtils.moveToElement(driver,Save);
	if (savecalender.isDisplayed()) {
		savecalender.click();
		Reportnames.clear();
		Reportnames.sendKeys("accountreport");
		ReportUniName.clear();
		ReportUniName.sendKeys("accountreports");
		if(Saveandrun.isSelected())
		{
			Saveandrun.click();
		}
		
	}
return false;
}
}

