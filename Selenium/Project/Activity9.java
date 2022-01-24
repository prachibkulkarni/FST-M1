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

public class Activity9 {
	
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
		
		//Login to application 
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
	    
		List<WebElement> options= driver.findElements(By.xpath("//ul[@id='primary-menu']//li"));
		System.out.println(options.size());
		//click on All Courses
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
		
		//Select the first course and open it
		WebElement firstCourse = driver.findElement(By.xpath("//h3[@class='entry-title']"));
		String courseTitle = firstCourse.getText();
		WebElement firstCourselink = driver.findElement(By.xpath("//p[@class='ld_course_grid_button']"));
		firstCourselink.click();
		
		//Get Expand link
		WebElement expandLnk = driver.findElement(By.xpath("//span[contains(text(),'Expand')]"));
		expandLnk.click();
		
		//Click on first lesson
		WebElement firstLesson = driver.findElement(By.id("ld-table-list-item-175"));
		firstLesson.click();
		
		//Get Module title on Lessons page
		WebElement lessonTitle=driver.findElement(By.id("ld-focus-mode-course-heading"));
	    System.out.println(lessonTitle.getText());
		
	    Assert.assertEquals(courseTitle, lessonTitle.getText());
		
	}
	
	@AfterMethod
	public void aftMethod()
	{
		driver.close();
	}
}



