package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.fbloginpage;

public class FbLoginTest {
	
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login()
	{
		fbloginpage ob = new fbloginpage(driver);
		ob.setValues("simi@abc.com", "Infy@123");
		ob.clickLogin();
	}
}
