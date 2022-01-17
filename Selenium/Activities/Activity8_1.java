package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		

		// Launch browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		//Display page title
		String title=driver.getTitle();
		System.out.println("Page Title = "+title);
		
		
		//Access WebTable to acess rows
		List<WebElement> objRows = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr"));
		System.out.println("No of rows ="+objRows.size());
		
		List<WebElement> objcols = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr[1]/td"));
		System.out.println("No of columns ="+objcols.size());
		
		//Print the third row of the table.
		
		
	
		//Print Third row
		List<WebElement> row3 = driver.findElements(By.xpath("//table[@class='ui celled striped table']//tr[3]"));
				for(WebElement colvalue: row3)
				{
					System.out.println(colvalue.getText());
					
				}
		
		//Print 2nd row 2nd column value
		WebElement colval = driver.findElement(By.xpath("//table[@class='ui celled striped table']//tr[2]//td[2]"));
		System.out.println("Value at 2nd row and 2nd column ="+colval.getText());
		
		//Close browser
		driver.close();
			
		

	}

}
