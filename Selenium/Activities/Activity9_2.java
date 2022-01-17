package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
			   // Launch browser
				WebDriver driver = new FirefoxDriver();
				driver.get("https://training-support.net/selenium/selects");
				
				//Display page title
				String title=driver.getTitle();
				System.out.println("Page Title = "+title);
				
				WebElement select= driver.findElement(By.id("multi-select"));
				
				Select list = new Select(select); 
				
				if (list.isMultiple())
				{
					System.out.println("List is multi select.");
				}
				else
				{
					System.out.println("List is single select.");
				}
				
				//Select the 'JavaScript' option by visible text.
				list.selectByVisibleText("Javascript");
				
				//Select the 'NodeJS' option by value.
				list.selectByValue("node");
				
				//Select the 4th, 5th, and the 6th options by index.
				list.selectByIndex(4);
				list.selectByIndex(5);
				list.selectByIndex(6);
				
				//Deselect the 'NodeJS' option by value attribute.
				list.deselectByValue("node");
				
				//Deselect the 7th option by index.
				list.deselectByIndex(7);
				
				//Print the first selected option.
				System.out.println("Selected first option is="+list.getFirstSelectedOption().getText());
				
				//Print all selected options one by one and deselect all options.
				List<WebElement> options = list.getOptions();
				
				for (WebElement opt : options)
				{
					System.out.println(opt.getText());
				}
				
	}

}
