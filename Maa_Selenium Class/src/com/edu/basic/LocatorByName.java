package com.edu.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		WebElement email=	driver.findElement(By.id("email"));
		email.sendKeys("Maaa");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Baba@7700");
		
		WebElement login=driver.findElement(By.id("u_0_b"));
		login.click();

	}

}

	

