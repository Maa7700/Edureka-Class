package com.edu.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Maa_Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
   WebElement Email=driver.findElement(By.name("email"));
   Email.sendKeys("ankitdking3@gmail.com");
   ///Thread.sleep(10000);
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Maa@7700");
   driver.findElement(By.xpath("//input[@type='submit']")).click();
  wait.until(ExpectedConditions.titleContains("Facebook"));
   String title=driver.getTitle();
  /// System.out.println(title);
  if (title.contains("ankitdking3@gmail.com"))
		   {
	   System.out.println("Login Succesfull");
		  }
   
else
   {
	   System.out.println("Login Failure");
   }
   }
   
   
   
	}



///Waits is of 2 types- Static Wait,Dynamic Wait.
///Static wait/Unconditional Synchronization-Thread.sleep---It holds the element loading for mentioned time only post that time next action would perform. Its not normally used in Real Time.
///Dynamic Wait/Conditional Synchronization is of 2 types-Implicitly wait,Explicitily Wait.
///Implicitily Wait-It mainly used for FindElemet/Elements method. Its the time given the webelement for loading;Post web element loaded it move for further action.No need to wait for mention time.
///Explicitly Wait- It mainly used for particular condition if executed.