package com.edu.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Maa_Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		/// Through Class Locator we received Exception because class name same for multiple elements.
		///Its process through Relative Xpath by putting Index Value also if class name is unique then Possible.
		
		WebElement password=driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		password.sendKeys("Baba@7700");

	}

}
