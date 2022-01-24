package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Test6()
	{
		driver.get("https://alchemy.hguy.co/lms");
		WebElement sel= driver.findElement(By.xpath("//ul[@id='primary-menu']//li[@id='menu-item-1507']"));
		sel.click();
		String newTitle= driver.getTitle();
		Assert.assertEquals(newTitle, "My Account – Alchemy LMS");
		WebElement lnk= driver.findElement(By.xpath("//a[text()='Login']"));
		lnk.click();
		//Find username and password fields and enter details
		WebElement userName = driver.findElement(By.id("user_login"));
		userName.sendKeys("root");
		WebElement passWord = driver.findElement(By.id("user_pass"));
		passWord.sendKeys("pa$$w0rd");
		
		WebElement btnLogin = driver.findElement(By.id("wp-submit"));
		btnLogin.click();
		WebElement btnsucc= driver.findElement(By.xpath("//a[@class='ld-profile-edit-link']"));
		String succMsg= btnsucc.getText();
		System.out.println(succMsg);
	    
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//Close the browser
		driver.close();
	}

}
