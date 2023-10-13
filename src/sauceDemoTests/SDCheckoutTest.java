package sauceDemoTests;

import org.testng.annotations.Test;

import basePkg.BaseClass;
import sauceDemoPages.SDCheckoutPage;

public class SDCheckoutTest extends BaseClass {
	
	@Test
	public void checkout()
	{
		SDCheckoutPage obj2 = new SDCheckoutPage(driver);
		obj2.clickCheckout();
	}


}
