package com.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectCasting {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://mail.rediff.com/cgi-bin/login.cgi'");
		String state= (String) js.executeScript("return document.readyState");
		System.out.println(state);
		
		js.executeScript("document.getElementById('login1').value='hello'");
		js.executeScript("window.scrollTo(0,100)");
		
	}

}
