package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		//get Title of page
		String title = driver.getTitle();
		System.out.println("Title of page ="+title);
		
		//Find "About us" link with xpath
		WebElement element = driver.findElement(By.xpath("//a[@id='about-link']"));
		element.click();
		
		//get Title of next page
		String secondTitle= driver.getTitle();
		System.out.println("Next page title is ="+secondTitle);
		
		//close the browser
		driver.close();
		
		

	}

}
