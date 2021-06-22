package com.edu.HandlingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Maaa");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Baba");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arangmaa@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8291447029");
		
		WebElement Male=driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
		
		WebElement Country=driver.findElement(By.cssSelector(".select2-selection"));
		Select c1=new Select(Country);
		c1.selectByIndex(3);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
