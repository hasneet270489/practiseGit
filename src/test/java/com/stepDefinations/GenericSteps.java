package com.stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.webdriver.Webconnector;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class GenericSteps {
	
	Webconnector con;
	
    public GenericSteps(Webconnector con) {
    	this.con=con;
    }
    
   
	
    @Before("@tag1")
	public void beforeScenario() {
		System.out.println("Before every scenario");
	}
	
	@After("@tag2")
	public void afterScenario() {
		System.out.println("After every scenario");
	}
	
	@Given("^I open (.*)$")
	public void openBrowser(String browserName) {
		System.out.println("Opening browser ");	
		con.openBrowser(browserName);
	}
	
	@And("^I navigate to (.*)$")
	public void i_navigate_to_url(String url) {
	    System.out.println("Navigate to the url ");
	    con.navigate(url);
	    
	}
	
	@And("I click on (.*) button")
		public void i_click_signIn_button(String locatorKey) {
			con.click(locatorKey);
		}
	

	@And("I type (.*) in (.*) field")
	public void i_enter_value(String data,String locatorKey) {
	con.type(locatorKey,data);	
	try{
		Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
	}
	
	
	@And("^I click (.*) and wait for (.*) to be visible$")
	public void i_click_and_wait(String locatorKey, String objectKey) {
	   con.click(locatorKey);
	   con.waitForElementToBePresent(objectKey);
	}
	
	@When("^I press (.*)$")
	public void i_click_loginButton(String locatorKey) {
	   con.click(locatorKey);
	}
	
	

	@Then("login should be (.*)")
	public void validateLogin(String expectedResult) {
		con.validateLogin(expectedResult);
	}

}
