package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// Launch url
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
				
		//Display page title
		String title=driver.getTitle();
		System.out.println("Page Title = "+title);
		
		//find Checkbox
		WebElement chk=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		//Remove checkobox
		WebElement remChk = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		remChk.click();
		
		//wait till Checkbox is disappeared.
		wait.until(ExpectedConditions.invisibilityOf(chk));
		
		//Appear checkbox again by clicking toggle button
		remChk.click();
		
		//Wait till checkbox appered
		wait.until(ExpectedConditions.visibilityOf(chk));
		chk.click();
		
		//close the browser
		driver.close();	
		
		

	}

}
