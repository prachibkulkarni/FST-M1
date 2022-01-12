package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {


			public static void main(String[] args) {
				//Launch browser
				WebDriver driver = new FirefoxDriver();
				driver.get("https://training-support.net/selenium/dynamic-controls");

				//Print page title
				String strTitle=driver.getTitle();
				System.out.println("Page Title = "+strTitle);
				
				//find Checkbox
				WebElement txtField=driver.findElement(By.xpath("//input[@id='input-text']"));
				
				if (txtField.isEnabled())
				{
					System.out.println("Textfield is enabled");
				}
				else
				{
					System.out.println("Textfield is not enabled");
				}
				
				//Enable Text field
				WebElement enableTxt = driver.findElement(By.id("toggleInput"));
				enableTxt.click();
				
				//After enabling the text field
				if (txtField.isEnabled())
				{
					System.out.println("Textfield is enabled");
				}
				else
				{
					System.out.println("Textfield is not enabled");
				}
			}
			

}





