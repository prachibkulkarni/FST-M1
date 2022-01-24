package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test3()
	{
		driver.get("https://alchemy.hguy.co/lms");
		WebElement firstInfo= driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']"));
		Assert.assertEquals(firstInfo.getText(),"Actionable Training");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}

}
