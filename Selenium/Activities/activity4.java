
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class activity4 {

	public static void main(String[] args) {
		
		// create driver object
		WebDriver driver = new FirefoxDriver();
		
		//Open a new browser to https://training-support.net/webelements/target-practice
		driver.get("https://training-support.net/webelements/target-practice");
		
		//Get the title of the page and print it to the console.
		System.out.println("Title is: "+ driver.getTitle());
			
		//Find the 3rd header on the page and print it's text to the console.
		String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
		System.out.println(thirdHeaderText);
		
		//Find the 5th header on the page and print it's color.
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
        
		//Find the purple button and print all it's classes.
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
		
		//Find the slate button and print it's text.
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);
		
		//Close the browser.	
		driver.close();

	}

}
