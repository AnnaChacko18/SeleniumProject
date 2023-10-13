package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDUserInfoPage {
	
	WebDriver driver;
	
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By postalCode = By.xpath("//input[@id='postal-code']");
	By continueButton = By.xpath("//input[@id='continue']");
	 
	
	public SDUserInfoPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setDetails()
	{
		driver.findElement(firstName).sendKeys("Anna");
		driver.findElement(lastName).sendKeys("Chacko");
		driver.findElement(postalCode).sendKeys("75034");
	}
    public void clickContinue()
    {
    	driver.findElement(continueButton).click();
    }
}
