package com.edu.basic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorByTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
///Collection Frame Work Used because it find multiple elements links and also return multiple links so need to create For Loop in this collection.
		///cases. Collection is nothing Just Storage.
		List<WebElement>alllinks= driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(WebElement link:alllinks)
		{
		    String text=link.getText();
		    System.out.println(text);
		
		}
		
	}

}
