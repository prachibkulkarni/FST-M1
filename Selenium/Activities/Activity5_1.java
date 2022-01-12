package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		//Launch browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");

		//Print page title
		String strTitle=driver.getTitle();
		System.out.println("Page Title = "+strTitle);
		
		//find Checkbox
		WebElement chk=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (chk.isDisplayed())
		{
			System.out.println("checkbox is displayed");
		}
		else
		{
			System.out.println("checkbox is not displayed");
		}
		
		//Remove checkobox
		WebElement remChk = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		remChk.click();
		
		//After remove check if it dipslayed
		if (chk.isDisplayed())
		{
			System.out.println("checkbox is displayed");
		}
		else
		{
			System.out.println("checkbox is not displayed");
		}
		
		
		
	}
	

}
