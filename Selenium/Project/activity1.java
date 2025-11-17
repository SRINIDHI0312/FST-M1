package activities;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Accessments {
	WebDriver driver;
	WebElement Heading1;
	WebElement Heading2;
	WebElement Image;
	WebElement Job;
	WebElement Keyword;
	WebElement Search_jobs;
	List<WebElement> Job_listing;
	WebElement Apply_jobs;
	WebElement Job_application_email;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	@Test
	public void Activity1() {
		driver.get("https://alchemy.hguy.co/jobs");
		String Title = driver.getTitle();
//		if(Title.equals("Alchemy Jobs – Job Board Application"))
//		{
//			driver.close();
//		}
		assertEquals(Title, "Alchemy Jobs – Job Board Application");
		driver.close();
	}

