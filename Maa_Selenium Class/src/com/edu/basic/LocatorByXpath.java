package com.edu.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());

		///Xpath-Its a locator to Find WebElement in a Web Page.
		///Its of 2 Types-Absolute-Its Start from Root to Till Element identified  Location.Only open tags. Its not used drawbacks are its so lengthy and if during devlopment any elemnt changed then its throw error"Unable to find Element".
		///Its start with single slash/.
		///Relative-It starts from Element location Tag only. It starts with Double slash//.
		///Text is used in Xpath if no attribute and value is there.
		///If ID,NAME and class not identified of a particular Web Element then go for Xpath. If only class is there and not uniquew that one then better go for text. Bcoz if class not Unique then it Identify Multiple elements.
		
		String Text =driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/h1/a")).getText();
		System.out.println(Text);
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Maaa");
		
		String Text1=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		System.out.println(Text1);
		
		WebElement Number=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		Number.sendKeys("8291447029");
		
		WebElement Firstname=driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		Firstname.sendKeys("Baba");
		
		String text=driver.findElement(By.xpath("//div[starts-with(text(),'Facebook helps')]")).getText();
		System.out.println(text);
		
		String contains =driver.findElement(By.xpath("//div[contains(text(),'quick')] ")).getText();
		System.out.println(contains);
		
	}

}
