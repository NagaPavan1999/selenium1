package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hello_selenium {

	public static void main(String[] args) throws Exception  {
	System.out.println(" hello selenium ");
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	String str =driver.getTitle();
	System.out.println(str);
	driver.findElement(By.linkText("REGISTER")).click();
	String str1=driver.getTitle();
	System.out.println(str1);
	//driver.findElement(By.name("firstName")).sendKeys("pravin");
	//driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/input")).sendKeys("raghuveer");
	driver.findElement(By.name("lastName")).sendKeys("singh");
	driver.findElement(By.name("phone")).sendKeys("9986111370");
	driver.findElement(By.name("postalCode")).sendKeys("123456");
	WebElement cnt=driver.findElement(By.name("country"));
	Select s1= new Select(cnt);
	s1.selectByVisibleText("INDIA");
	Thread.sleep(2000);
	s1.selectByIndex(95);
	Thread.sleep(2000);
	s1.selectByValue("HUNGARY");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("sign-in")).click();
	driver.findElement(By.name("userName")).sendKeys("mercury");
	
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
	String s3=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
	System.out.println(s3);
	
	
	
	
	
	
	
	
//		driver.switchTo().frame(0);
//	Thread.sleep(2000);
////	driver.findElement(By.id("closeBtn")).click();
//	driver.findElement(By.xpath("//*[@id='closeBtn']")).click();
//	driver.switchTo().defaultContent();
//	Thread.sleep(3000);
//	
//	driver.findElement(By.linkText("REGISTER")).click();
//	Thread.sleep(2000);
//	driver.switchTo().frame(0);
//	driver.findElement(By.xpath("//*[@id='closeBtn']")).click();
//	driver.switchTo().defaultContent();
//	//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
//	driver.findElement(By.name("firstName")).sendKeys("pravin");
//	
//	driver.findElement(By.name("lastName")).sendKeys("pravin");

	}

}