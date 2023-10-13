package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbCreatePage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='reg_pages_msg']/a[1]")
	WebElement createPageButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getStartedButton;
	
	public FbCreatePage(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreatePage()
	{
		createPageButton.click();
	}
    public void clickGetStarted()
    {
    	getStartedButton.click();
    }
}
