package sauceDemoTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePkg.BaseClass;
import sauceDemoPages.SDHomePage;
import sauceDemoPages.SDLoginPage;

public class SDHomeTest extends BaseClass{
	//WebDriver driver;
	
//	@BeforeTest
//	public void setup()
//	{
//		driver = new ChromeDriver();
//		
//	}
  
	 @Test
	 public void testAddToCart() throws Exception, InterruptedException
	 {
		 SDLoginPage ob1 = new SDLoginPage(driver);
		 ob1.setValues();
		 
		 SDHomePage ob = new SDHomePage(driver);
		 ob.addItemsToCart();
		 ob.clickCart();
	 }
}
