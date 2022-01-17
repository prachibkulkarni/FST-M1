package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		// Launch browser
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/tables");
				
				//Display page title
				String title=driver.getTitle();
				System.out.println("Page Title = "+title);
				WebDriverWait wait= new WebDriverWait(driver, 20);
				
				//Access WebTable to access rows for Dynamic table
				List<WebElement> objRows = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody/tr"));
				System.out.println("No of rows ="+objRows.size());
				
				List<WebElement> objcols = driver.findElements(By.xpath("//table[@id='sortableTable']//tbody/tr[1]/td"));
				System.out.println("No of columns ="+objcols.size());
				
							
				//Print 2nd row 2nd coulmn value for Dynamic table
				WebElement colval = driver.findElement(By.xpath("//table[@id='sortableTable']//tbody/tr[2]//td[2]"));
				System.out.println("Value at 2nd row and 2nd column ="+colval.getText());
				
				//sort the table
				WebElement thead= driver.findElement(By.xpath("//table[@id='sortableTable']//th[1]"));
				System.out.println(thead.getText());
				thead.click();
				
				//Wait till sort descending appears
				WebElement sort= driver.findElement(By.xpath("//th[@class='sorted ascending']"));
				wait.until(ExpectedConditions.visibilityOf(sort));
				
				//Print above value after sort
				WebElement theadafterSort= driver.findElement(By.xpath("//table[@id='sortableTable']//tbody/tr[2]//td[2]"));
				System.out.println("Value at 2nd row and 2nd column after sort ="+theadafterSort.getText());
				
				//Close browser
				driver.close();
					
				

	}

}
