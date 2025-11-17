
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1 {

	public static void main(String[] args) {
		
		// create driver object
		WebDriver driver = new FirefoxDriver();
				
		// Open the browser
		driver.get("https://training-support.net");
		
		//Print the title of the page
		System.out.println("page title is: " + driver.getTitle());
		
		//Click the about us button
		driver.findElement(By.linkText("About Us")).click();

		//Print the title of the new page
		System.out.println("New page title is: " + driver.getTitle());
		
		//Close the browser
	    driver.quit();	
	}

}
