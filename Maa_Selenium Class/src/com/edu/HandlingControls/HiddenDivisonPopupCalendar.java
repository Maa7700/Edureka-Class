package com.edu.HandlingControls;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HiddenDivisonPopupCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Maa_Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement date=driver.findElement(By.xpath("//input[@title='Depart date']"));
		date.click();
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default '])[1]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	

		
	}

}
