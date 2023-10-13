package sauceDemoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SDHomePage {

	WebDriver driver;
	By shoppingCartButton = By.xpath("//a[@class='shopping_cart_link']");
	By addToCartButton = By.xpath("//div[@class='inventory_item']/div[2]/div[2]/button[1]");
	By hamburgerButton = By.xpath("//button[@id='react-burger-menu-btn']");
	By logoutButtn = By.xpath("//a[@id='logout_sidebar_link']");
	
	public SDHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void addItemsToCart()
	{
		List<WebElement> addToCartButtonList = driver.findElements(addToCartButton);
		for(WebElement addToCartButton:addToCartButtonList)
		{
			addToCartButton.click();
		}
	}
	public void clickCart()
	{
		driver.findElement(shoppingCartButton).click();
	}
	public void logout()
	{
		driver.findElement(hamburgerButton).click();
		driver.findElement(logoutButtn).click();
	}
	
}
