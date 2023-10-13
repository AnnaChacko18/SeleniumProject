package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	WebDriver driver;
	
	By fbEmailButton = By.name("email");
	By fbPasswordButton = By.name("pass");
	By fbLoginButton = By.name("login");
	
	
	public fbloginpage(WebDriver driver)
	{
	  this.driver = driver;
	}
	
	public void setValues(String email,String password)
	{
		driver.findElement(fbEmailButton).sendKeys(email);
		driver.findElement(fbPasswordButton).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(fbLoginButton).click();
	}
}
