package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;

public class Webconnector {
	
	static WebDriver driver;
	public static Properties prop;	
	public String name;
	DesiredCapabilities cap;
	
   public Webconnector() {
	 if(prop==null) {
		 prop=new Properties();
		 try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties");
	        prop.load(fs);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
		}
	 }
   }

public void openBrowser(String browserName) {
	if(browserName.equalsIgnoreCase("Mozilla"))
		driver=new FirefoxDriver();
	else if(browserName.equalsIgnoreCase("Chrome")) {
		driver= new ChromeDriver();
	    driver.manage().window().maximize();   
	}
	else if(browserName.equalsIgnoreCase("IE")) {
		cap = new DesiredCapabilities().internetExplorer();
        cap.setCapability("nativeEvents", false);
		driver=new InternetExplorerDriver(cap);
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void navigate(String url) {
	driver.get(prop.getProperty(url));
	
	
}

public void type(String objectKey,String data) {
	getObject(objectKey).sendKeys(data);
	System.out.println(data);
	}

public void click(String objectKey) {
	
	getObject(objectKey).click();
	}



public boolean isElementPresent(String objectKey) {
	List<WebElement> e = null;
	try {
		if(objectKey.endsWith("_xpath"))
	e= driver.findElements(By.xpath(prop.getProperty(objectKey)));
		else if(objectKey.endsWith("_id"))
	e= driver.findElements(By.id(prop.getProperty(objectKey)));		
		
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	if(e.size()==0)
		   return false;
	   else
		   return true;
   
}

public void waitForElementToBePresent(String objectKey) {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(objectKey))));
	
}


public void validateLogin(String expectedResult) {
	boolean result = isElementPresent("password_xpath");
	String actualResult="";
	if(result)
		actualResult="failure";
		else 
			actualResult="success";
	
	if(!expectedResult.equals(actualResult))
		System.out.println("Scenario is failed");
}


public WebElement getObject(String objectKey) {
	WebElement element= null;
	try {
		if(objectKey.endsWith("_xpath"))
	element= driver.findElement(By.xpath(prop.getProperty(objectKey)));
		else if(objectKey.endsWith("_id"))
	element= driver.findElement(By.id(prop.getProperty(objectKey)));		
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty(objectKey))));
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
   return element;
}

public void login(String username, String password, String phoneNumber) {
	type("username_xpath", username);
	type("password_xpath", password);
	click("continueButton_xpath");
	type("mobileNumber_xpath",phoneNumber);
	click("continueButton_xpath");
	type("password_xpath", password);
	click("continueButton_xpath");
	
	
}


 
}
