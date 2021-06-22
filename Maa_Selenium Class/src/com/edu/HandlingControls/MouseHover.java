package com.edu.HandlingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\arpit\\\\Maa Code\\\\Selenium_Project\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Sarees=driver.findElement(By.xpath("//a[@href=\"/womens-clothing/sarees/?MID=megamenu_sarees_seeall\"]"));
		
		Actions action =new Actions(driver);
		action.moveToElement(Sarees).perform();
	
		
		WebElement Salwar=driver.findElement(By.xpath("//a[@href=\"https://www.craftsvilla.com/cvfeeds/buy-crepe-drapes-online-craftsvilla\"]"));
		Salwar.click();

		wait.until(ExpectedConditions.titleContains("Crepe"));
		String title=driver.getTitle();
		
		if(title.contains("Anarkali"))
		{
		
			System.out.println("Navigate to Anarkali Suits Page");
		}
		
			else
			
			System.out.println("Test Cases Failed");	
			
		
	}
}

