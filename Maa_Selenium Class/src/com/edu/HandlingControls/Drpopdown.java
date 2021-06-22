package com.edu.HandlingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drpopdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Maaa");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Baba");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arangmaa@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8291447029");
		
		WebElement Male=driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
	System.out.println(Male.isEnabled());
	
		
		WebElement Hobby=driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hobby.click();
		
		//WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		//Select oskill=new Select(skill);
	//oskill.selectByIndex(3);
		//oskill.selectByValue("Android");
	//oskill.selectByVisibleText("CSS");
		
		WebElement country=driver.findElement(By.id("countries"));
		Select Count=new Select(country);
		Count.selectByIndex(4);
		
		//WebElement ocountries=driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		//ocountries.click();
		//WebElement search=driver.findElement(By.xpath("//input[@type=\"search\"]"));
		//search.sendKeys("India");
			//	search.submit();
				//Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.id("yearbox"));
		Select year=new Select(date);
		year.selectByIndex(3);
	
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}

//.is enabled-For RadioButton
///.is displayed-For Webelement
///.isselected-For Checkbox


// Select Cou=new Select(ocountries);
//   Cou.selectByIndex(7);
	//search.sendKeys("India");
	//search.submit();
	//Thread.sleep(3000);
