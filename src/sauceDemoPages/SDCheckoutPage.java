package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDCheckoutPage  {
	WebDriver driver;
	
	By checkoutButton = By.xpath("//button[@id='checkout']");
	
	
	
	public SDCheckoutPage(WebDriver driver) {
		this.driver= driver;
	}

	public void clickCheckout()
	{
		driver.findElement(checkoutButton).click();
	}

}
