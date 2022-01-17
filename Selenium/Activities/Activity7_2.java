package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		//Display page title
		String title=driver.getTitle();
		System.out.println("Page Title = "+title);
		
		//Find and enter details in sign-up fields
		WebElement userName = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]//following::input[1]"));
		userName.sendKeys("Prachi");
		
		WebElement password = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]//following::input[2]"));
		password.sendKeys("Test123");
		
		WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[1]"));
		confirmPassword.sendKeys("Test123");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Test123@gmail.com");
		
		//click on "Sign up" button
		WebElement btnsubmit = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		btnsubmit.click();
		
		//Confirm success message
		WebElement succMsg = driver.findElement(By.id("action-confirmation"));
		System.out.println(succMsg.getText());
		
		//close browser
		driver.close();	
		
	}

}
