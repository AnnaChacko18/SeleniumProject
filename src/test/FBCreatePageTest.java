package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FbCreatePage;

public class FBCreatePageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testCreatePage()
	{
		FbCreatePage ob = new FbCreatePage(driver);
		ob.clickCreatePage();
		ob.clickGetStarted();
	}
}
