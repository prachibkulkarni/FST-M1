package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
			
			// Launch browser
			WebDriver driver = new FirefoxDriver();
			Actions act = new Actions(driver);
			driver.get("https://www.training-support.net/selenium/input-events");
			
			//Display page title
			String title=driver.getTitle();
			System.out.println("Page Title = "+title);
			
			//Find cube element
			WebElement cube = driver.findElement(By.id("wrapD3Cube"));
			//System.out.println(cube.g);
			
			//Left click on cube 
			act.click(cube).build().perform();
			WebElement chgno = driver.findElement(By.xpath("//div[@class='active']"));
			System.out.println("chnaged no after Left click is ="+chgno.getText());
			
			//double click
			act.doubleClick(cube).build().perform();
			chgno = driver.findElement(By.xpath("//div[@class='active']"));
			System.out.println("chnaged no after double click is ="+chgno.getText());
			
			//Right click
			act.contextClick(cube).build().perform();
			chgno = driver.findElement(By.xpath("//div[@class='active']"));
			System.out.println("chnaged no After Right click is ="+chgno.getText());
			
			//Close browser
			driver.close();
			
			

	}

}
