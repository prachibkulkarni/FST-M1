package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		
		//Find and set First Name		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Prachi");
		
		//Find and set Last name
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Kulkanri");
		Thread.sleep(5000);
		
		//find and set email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("prachibkulkarni@yahoo.com");
		
		//Find and set phone
		WebElement phone = driver.findElement(By.id("number"));
		phone.sendKeys("12345678901");
		
		//Find sumit button and click it
		WebElement button= driver.findElement(By.xpath("//input[@class='ui green button']"));
		button.submit();
		Thread.sleep(1000);
		
		//close the driver
		driver.close();
		
		
		
		
		
		
	}

}
