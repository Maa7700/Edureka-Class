package com.edu.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorBypartialText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement account=driver.findElement(By.partialLinkText("account?"));
		account.click();

	}

}
