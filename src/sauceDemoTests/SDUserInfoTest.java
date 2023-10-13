package sauceDemoTests;

import java.io.IOException;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import sauceDemoPages.SDCheckoutPage;
import sauceDemoPages.SDHomePage;
import sauceDemoPages.SDLoginPage;
import sauceDemoPages.SDUserInfoPage;

public class SDUserInfoTest extends BaseClass {
	
	@Test
	public void continueToCheckout() throws InterruptedException, IOException
	{
		
		SDLoginPage ob1 = new SDLoginPage(driver);
		 ob1.setValues();
		 
		 SDHomePage ob = new SDHomePage(driver);
		 ob.addItemsToCart();
		 ob.clickCart();
		 Thread.sleep(5000);
		 SDCheckoutPage obj2 = new SDCheckoutPage(driver);
		 obj2.clickCheckout();
		
		 
	SDUserInfoPage obj3 = new SDUserInfoPage(driver);
	obj3.setDetails();
	obj3.clickContinue();
	ob.logout();
	}

}
