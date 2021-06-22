package com.edu.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFacebook extends BaseTest
{
	
	@DataProvider
	
	public String[][] getdata()
	{
	  String[][]credentials=new String[2][2];
	  credentials[0][0]="ankitdking3@gmail.com";
	  credentials[0][1]="Maa@7700";
	  credentials[1][0]="ankitdking3@gmail.com";
	  credentials[1][1]="Maa@7700";
	  
	return credentials;
	}
	
	@Test(dataProvider="getdata")
	
	public void TC_01_LoginFB(String Email,String Password)
	{
		 WebElement email=driver.findElement(By.name("email"));
		   email.sendKeys(Email);
		   ///Thread.sleep(10000);
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		  wait.until(ExpectedConditions.titleContains("Facebook"));
		   String title=driver.getTitle();
		  String expectedtitle="Facebook";
		  
		  Assert.assertEquals(title, expectedtitle);
		
		
	}

}
