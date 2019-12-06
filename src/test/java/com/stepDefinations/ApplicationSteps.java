package com.stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;

import com.webdriver.Webconnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

@SuppressWarnings("deprecation")
public class ApplicationSteps  {

	Webconnector con;
	
	public ApplicationSteps(Webconnector con) {
    	this.con=con;
    }
	
	@Given("^I launch (.*) and open (.*)$")
	public void i_have_browser(String browserName, String url) {
		System.out.println("Browser name is " +(browserName));
		con.openBrowser(browserName);
		con.navigate(url);
		
		}
	
	@And("^I login to application$")
	public void i_login(Map<String,String> data) {
	System.out.println(data.get("username"));
	System.out.println(data.get("password"));
	System.out.println(data.get("phoneNumber"));
	
	con.login(data.get("username"),data.get("password"),data.get("phoneNumber"));	
	}
	
}
