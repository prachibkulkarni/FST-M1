package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test7()
	{
		driver.get("https://alchemy.hguy.co/lms");
		List<WebElement> options= driver.findElements(By.xpath("//ul[@id='primary-menu']//li"));
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			String opt = options.get(i).getText();
			System.out.println(opt);
			if(opt.contains("All Courses"))
			{
				options.get(i).click();
				System.out.println("It clicked");
				break;
			}
			
				
		}
		

		//Get no of all courses
		List<WebElement> lst= driver.findElements(By.xpath("//h3[@class='entry-title']"));
		System.out.println(lst.size());
		//Print all the courses
		for (int i=0;i<lst.size();i++)
		{
			String opt = lst.get(i).getText();
		 System.out.println(opt);
		}
		
	    
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}


}
