package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test4()
	{
		driver.get("https://alchemy.hguy.co/lms");
		WebElement firstInfo= driver.findElement(By.xpath("(//div[contains(@id,\"ld-course-list-content\")]//h3)[2]"));
		Assert.assertEquals(firstInfo.getText(),"Email Marketing Strategies");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}

}
