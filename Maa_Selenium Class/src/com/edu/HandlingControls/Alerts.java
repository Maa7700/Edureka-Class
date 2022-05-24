

package com.edu.HandlingControls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Maa_Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		///Popup Types-Alert Popup,Hidden Division Popup,WindowPopup,ChildBrowser Popup
		//Information Alert
		
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		
		//Confirmation Alert
		
		//driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		//driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//Alert alert =driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		//WebElement test=driver.findElement(By.xpath("//p[@id='demo']"));
		//System.out.println(test.getText());
		
		//Modal Alert
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.sendKeys("Maaa");
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());
		
		

	}

}
