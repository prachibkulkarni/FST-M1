package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		//Launch url
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		
		//Print page title
		String title= driver.getTitle();
		System.out.println("Page title = "+title);
		
		//Find third header
		WebElement thirdelement = driver.findElement(By.xpath("//h3[@id='third-header']"));
		System.out.println("Text of third element = "+thirdelement.getText());
		
		//Find fifth element
		WebElement fifthelement = driver.findElement(By.xpath("//h5[text()='Fifth header']"));
		System.out.println("Text of fith element ="+fifthelement.getText());
		
		//get colour attribute of fifth element
		String color = fifthelement.getCssValue("color");
		System.out.println("Color of fifth element ="+fifthelement);
		
		//get Violet button
		WebElement btnViolet= driver.findElement(By.xpath("//button[text()='Violet']"));
		//print class attribute
		String classatt= btnViolet.getAttribute("class");
		System.out.println("class attribute for violet = "+classatt);
		
		//get Absolute xpath of Gray button
		WebElement btngray= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("Text of gray button= "+btngray.getText());
		
		//close browser
		driver.close();
		

	}

}
