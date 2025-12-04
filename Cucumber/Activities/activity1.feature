
@activity1
Feature: Basic Syntax
  
  Scenario: Opening a webpage using Selenium
    Given user is on the TS homepage
    When the user clicks on the About Us link
    Then they are redirected to another page
TSHomepageSteps.java:

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TSHomepageSteps extends BaseClass {
	@Given("user is on the TS homepage")
	public void openTSHomepage() throws Throwable {
		// Open the browser
		driver.get("https://training-support.net");
		assertEquals(driver.getTitle(), "Training Support");
	}

	@When("the user clicks on the About Us link")
	public void clickButton() throws Throwable {
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("they are redirected to another page")
	public void aboutUsPage() throws Throwable {
		wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText();

		System.out.println("New page title is: " + pageHeading);
		assertEquals(pageHeading, "About Us");
	}
}
ActivitiesRunner.java Solution:
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;

import io.cucumber.junit.platform.engine.Constants;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(
  key = Constants.GLUE_PROPERTY_NAME,
  value = "stepDefinitions")
@ConfigurationParameter(
  key = Constants.FILTER_TAGS_PROPERTY_NAME,
  value = "@activity1")

public class TestRunner {}
