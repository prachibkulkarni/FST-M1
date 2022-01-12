package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// create driver instance
		WebDriver driver=new FirefoxDriver();
		
		//Launch url
		driver.get("https://www.training-support.net");
		
		//find "About us" with id()
		WebElement element = driver.findElement(By.id("about-link"));
		//element.click();
		System.out.println("Link clicked with id "+element.getText());
		
		//find "About us" with className()
		
		WebElement element1 = driver.findElement(By.xpath("//a[@class='ui inverted huge green button']"));
		//element1.click();
		System.out.println("Link clicked with class "+element1.getText());
		
		//find "About us" with linkText()
		
		WebElement element2 = driver.findElement(By.linkText("About Us"));
		//element2.click();
		System.out.println("Link clicked with linkText "+element2.getText());
		
		//find "About us" with cssSelector()
		
		WebElement element3 = driver.findElement(By.cssSelector(".green"));
		//element3.click();
		System.out.println("Link clicked with cssSelector "+element3.getText());
		
		//close the browser
		driver.close();

	}

}
