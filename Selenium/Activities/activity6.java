
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity6 {

	public static void main(String[] args) {
	
		// create driver object
		WebDriver driver = new FirefoxDriver();
		
		//Open a new browser to https://training-support.net/webelements/dynamic-controls
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//get title of the page
		System.out.println("ttile of the page is: "+driver.getTitle());
		
		//Find the checkbox input element.
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		
		// Click it
        checkbox.click();
        
        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        
        // Click chcekbox again
        checkbox.click();
        
        //Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        
        // Close the browser
        driver.quit();

	}

}
