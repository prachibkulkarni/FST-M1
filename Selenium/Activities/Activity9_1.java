package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// Launch browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		//Display page title
		String title=driver.getTitle();
		System.out.println("Page Title = "+title);
		
		WebElement select= driver.findElement(By.id("single-select"));
		
		Select list = new Select(select); 
		
		//Select the second option using selectByVisibleText()
		list.selectByVisibleText("Option 2");
		
		//Select the third option using selectByIndex()
		list.selectByIndex(3);
		
		//Select the fourth option using selectByValue()
		list.selectByValue("4");
		
		//Finally, get all the options in the dropdown and print them one by one
		List<WebElement> opts = list.getOptions();
		
         for (WebElement opt : opts)
         
         {
        	 System.out.println(opt.getText());
         }
		
         //Close browser
         driver.close();

	}

}
