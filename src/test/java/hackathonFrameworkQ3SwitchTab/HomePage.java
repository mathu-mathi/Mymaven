package hackathonFrameworkQ3SwitchTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public void LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 @FindBy(name = "q")
	    private WebElement searchBox;

	    public WebElement getSearchBox() 
	    {
	        return searchBox;
	    }

}
