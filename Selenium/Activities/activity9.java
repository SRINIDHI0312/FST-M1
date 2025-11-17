
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity9 {

	public static void main(String[] args) {
	
		//Create driver object
		WebDriver driver = new FirefoxDriver();
				
		// Create the Actions object
		Actions builder = new Actions(driver);
				
		//Open a new browser to https://training-support.net/webelements/mouse-events
		driver.get("https://training-support.net/webelements/keyboard-events");
				
		//get title of the page
		System.out.println("Title of the page is: "+driver.getTitle());
		
		// Press the key
        builder.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
        
        // Print the message from the page
        String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);

        // Close the browser
        driver.quit();

	}

}
