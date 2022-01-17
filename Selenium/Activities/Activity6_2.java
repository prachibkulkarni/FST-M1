package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// Launch browser

		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/ajax");
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
				
		//Display page title
		String title=driver.getTitle();
		System.out.println("Page Title = "+title);
		
		//Find chnage content button and click on it.
		WebElement btnChCon= driver.findElement(By.xpath("//div[@id='ajax-content']//button[contains(text(),'Content')]"));
		btnChCon.click();
		
		//Wait for Heading 'Hello" to appear
		WebElement hello=driver.findElement(By.xpath("//div[@id='ajax-content']"));
		wait.until(ExpectedConditions.textToBePresentInElement(hello, "HELLO"));
		
		System.out.println(hello.getText());
		
		
		//Get messgae
		wait.until(ExpectedConditions.textToBePresentInElement(hello, "late"));
		System.out.println(hello.getText());
		
		
		//close browser
		driver.close();
		
		

	}

}
