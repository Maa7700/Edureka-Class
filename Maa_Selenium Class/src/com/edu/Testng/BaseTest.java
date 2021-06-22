package com.edu.Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;




public class BaseTest {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	
	@Parameters({"BrowserType"})
	@BeforeMethod
	public void Login(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		
		else if(Browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.geko.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\gekodriver.exe");
			 driver =new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		// driver =new ChromeDriver();
		 wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
		@AfterMethod
		public void LoggedOut() 
		{
			driver.quit();
			
		}
		
		
		
	}
	
	


