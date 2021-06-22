package com.edu.HandlingControls;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\git\\repository\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Multi-PopUp Test"));
		
		Set<String>Windowhandles=driver.getWindowHandles();
		for(String handle:Windowhandles)
		{
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			String URL=driver.getCurrentUrl();
			System.out.println(URL);
			driver.close();
		}
		}

	}

