package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test8()
	{
		//Launch url 
		driver.get("https://alchemy.hguy.co/lms");
		
		//Get navigation bar
		List<WebElement> options= driver.findElements(By.xpath("//ul[@id='primary-menu']//li"));
		System.out.println(options.size());
		
		//click on Contact
		for(int i=0;i<options.size();i++)
		{
			String opt = options.get(i).getText();
			System.out.println(opt);
			if(opt.contains("Contact"))
			{
				options.get(i).click();
				System.out.println("contact clicked");
				break;
			}
				
		}
		
		//Find all fields in contact
		WebElement fullName=driver.findElement(By.id("wpforms-8-field_0"));
		WebElement email = driver.findElement(By.id("wpforms-8-field_1"));
		WebElement subJect = driver.findElement(By.id("wpforms-8-field_3"));
		WebElement cmtMessage =driver.findElement(By.id("wpforms-8-field_2"));
		
		//Enter details in all fields
		fullName.sendKeys("Prachi B Kulkarni");
        email.sendKeys("prachi.kulkarni@gmail.com");
        subJect.sendKeys("Test Selenium Project");
        cmtMessage.sendKeys("Comment for test in Selenium Project");

        //Submit the details
        WebElement btnSubmit = driver.findElement(By.id("wpforms-submit-8"));
        btnSubmit.click();
        
        //Print success message for submission
        WebElement succMsg = driver.findElement(By.id("wpforms-confirmation-8"));
        String msg = succMsg.getText();
        System.out.println("Success Message ="+msg);
        
	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close browser
		driver.close();
	}

}
