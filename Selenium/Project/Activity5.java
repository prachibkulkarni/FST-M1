package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test5()
	{
		driver.get("https://alchemy.hguy.co/lms");
		WebElement sel= driver.findElement(By.xpath("//ul[@id='primary-menu']//li[@id='menu-item-1507']"));
		sel.click();
		String newTitle= driver.getTitle();
		Assert.assertEquals(newTitle, "My Account – Alchemy LMS");
	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}


}
