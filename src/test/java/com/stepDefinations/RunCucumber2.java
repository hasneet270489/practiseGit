package com.stepDefinations;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		monochrome=true,
		strict=true,
		features= {"src/test/resources/"},
		glue= {"com.stepDefinations"},
		plugin={
				"pretty",
				"html:target/site/cucumber-html",
		       "json:target/cucumber-report.json"},
		tags= {"@MultipleLogins"}
		
		)
public class RunCucumber2 extends AbstractTestNGCucumberTests {
	
}
