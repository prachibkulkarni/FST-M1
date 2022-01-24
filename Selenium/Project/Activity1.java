package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test1()
	{
		driver.get("https://alchemy.hguy.co/lms");
		String title= driver.getTitle();
		Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
	}
	
	@Test
	public void Test2()
	{
		driver.get("https://alchemy.hguy.co/lms");
		WebElement header= driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
		Assert.assertEquals(header.getText(),"Learn from Industry Experts");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}

}
