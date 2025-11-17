
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity7 {

	public static void main(String[] args) {
		// create driver object
		WebDriver driver = new FirefoxDriver();
				
		//Open a new browser to https://training-support.net/webelements/dynamic-controls
		driver.get("https://training-support.net/webelements/dynamic-controls");
				
		//get title of the page
		System.out.println("ttile of the page is: "+driver.getTitle());
		
		// Find the text field
        WebElement textbox = driver.findElement(By.id("textInput"));
        
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        // Click the toggle button to enable it
        driver.findElement(By.id("textInputButton")).click();
        
        // Check if the text field is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        // Type something in to it
        textbox.sendKeys("Example text");
        System.out.println(textbox.getDomProperty("value"));

        // Close the browser
        driver.quit();

	}

}
