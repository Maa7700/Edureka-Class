package com.edu.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorByID {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		System.out.println(Driver.getWindowHandle());
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		
		Driver.get("https://www.facebook.com/");
		
	WebElement email=	Driver.findElement(By.id("email"));
	email.sendKeys("Maaa");
	
	///Driver.close();
		

		
			
		
		
	}
}