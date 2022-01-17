package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		
				// Launch browser
				WebDriver driver = new FirefoxDriver();
				driver.get("https://training-support.net/selenium/dynamic-attributes");
				
				WebDriverWait wait= new WebDriverWait(driver, 20);
				
				//Display page title
				String title=driver.getTitle();
				System.out.println("Page Title = "+title);
				
				//Find and type in Username/Password fields
				WebElement userName = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
				userName.sendKeys("admin");
				
				WebElement passWord = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
				passWord.sendKeys("password");
				//Find and click Log-in button
				WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
				btnSubmit.click();
				
				//Wait for success msg 
				WebElement succMsg = driver.findElement(By.id("action-confirmation"));
				wait.until(ExpectedConditions.textToBePresentInElement(succMsg, "Welcome Back, admin"));
				System.out.println(succMsg.getText());
				
				//close browser
				driver.close();	
	}

}
