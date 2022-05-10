package com.edu.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\Maa Code\\Selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String Windowinstance=driver.getWindowHandle();
		System.out.println(Windowinstance);
		//System.out.println(driver.getWindowHandle());
		///Window handle mainly shows the Browser Instance ID.Then We know which browser currently it is in case of if multiple browser if oppens.
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
       
		
		driver.close();
		
		
	}

}
