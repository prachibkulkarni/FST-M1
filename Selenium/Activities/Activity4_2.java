package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/simple-form");
				
				//get Title of page
				String title = driver.getTitle();
				System.out.println("Title of page ="+title);
				
				//Find first Name with xpath
				WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
				firstName.sendKeys("Sameer");
				
				//FindLast name with xpath
				WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
				lastName.sendKeys("Kotasthane");
				
				//Find email with xpath
				WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("sameekotasthane@yahoo.com");
				
				
				//Find phone with xpath
				WebElement phone=driver.findElement(By.xpath("//input[@id='number']"));
				phone.sendKeys("sameekotasthane@yahoo.com");
				
				//submit the form
				WebElement button= driver.findElement(By.xpath("//input[@class='ui green button']"));
				button.submit();
				Thread.sleep(5000);
				//close the browser
				driver.close();
				
				

	}

}
