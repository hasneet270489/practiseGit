package com.stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesInfo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cnn.com");
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> it= cookies.iterator();
		
		while(it.hasNext()) {
			Cookie c= it.next();
			System.out.println(c.getName()+ "----" + c.getValue());
			
			if(c.getName().equalsIgnoreCase("countryCode")) {
				driver.manage().deleteCookie(c);
				Cookie myCookie = new Cookie("countryCode", "UK");
				driver.manage().addCookie(myCookie);
			}
		}
			System.out.println("-------------------------------------------------------------------------");
			
			
			while(it.hasNext()) {
				Cookie c= it.next();
				System.out.println(c.getName()+ "----" + c.getValue());
		}
	}
	}


