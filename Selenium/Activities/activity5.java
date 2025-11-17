
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5 {

	public static void main(String[] args) {
	
	// create driver object
	WebDriver driver = new FirefoxDriver();
	
	//Open a new browser to https://training-support.net/webelements/dynamic-controls
	driver.get("https://training-support.net/webelements/dynamic-controls");
	
	//Get the title of the page and print it to the console.
	System.out.println("Title of the page is: "+ driver.getTitle());
	
	//Find the check box input element.
	WebElement checkbox = driver.findElement(By.id("checkbox"));
	
	//Find the toggle button and click it
	driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	
    // Check if it is displayed on the page
    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
    
    // Click the button again
    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
    
    // Check if it is displayed on the page
    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	
	//Close the browser.
    driver.close();
    
	}

}
