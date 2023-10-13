package sauceDemoPages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDLoginPage {
	
	WebDriver driver;
	
	By usernameField = By.xpath("//input[@id='user-name']");
	By passwordField = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	
	public SDLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
    public void setValues() throws InterruptedException, IOException

    {
    	FileInputStream file = new FileInputStream("C:\\Users\\user\\Downloads\\LoginTestData.xlsx");
		XSSFWorkbook workboook = new XSSFWorkbook(file);
		XSSFSheet sheet = workboook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+" " +password);
		
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	        clickLogin();
	        clearValues();
		}
    }
    public void clearValues()
    {
    	
    	driver.navigate().refresh();
    	//driver.findElement(usernameField).clear();
    	//driver.findElement(passwordField).click();
    	//driver.findElement(passwordField).clear();
    }
    public void clickLogin() throws InterruptedException
    {
    	driver.findElement(loginButton).click();
    	Thread.sleep(3000);
    		
    }
}
