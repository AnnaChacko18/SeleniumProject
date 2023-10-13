package sauceDemoTests;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePkg.BaseClass;
import sauceDemoPages.SDHomePage;
import sauceDemoPages.SDLoginPage;

public class SDLoginTest extends BaseClass {
	
//	WebDriver driver;
//	@BeforeTest
//	public void setup()
//	{
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//	}
	
	@Test
	public void checkLogin() throws IOException, InterruptedException
	{
		SDLoginPage ob = new SDLoginPage(driver);
		ob.setValues();
		
	}
}
