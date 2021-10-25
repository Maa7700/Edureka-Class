package com.edu.HandlingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Maa_Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement singleframe=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		


		driver.switchTo().frame(singleframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MAAA");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Baba");
		 
	    

		
		///Frame is 2 types- Inline Frame,Independent Frame.
	    ///Inline Frame-Frame Inside Frame.
	    ///Independent Frame-Multiple Frames Inside A Frame.
	    /////////3 methods used for Frame - id,name,WebElement.
		 ////Attributes here are- Id,Name,Webelement(SRC)....
		
		
	}

}
