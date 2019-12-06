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
		       "json:target/cucumber-report.json"}
		
		)
public class RunCucumber extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
        return super.scenarios();
    }
}
