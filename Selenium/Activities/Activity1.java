package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// Launch url in browser
		WebDriver driver=new FirefoxDriver();
		
		//Launch url
		driver.get("https://www.training-support.net");
		
		//close browser
		driver.close();

	}

}
