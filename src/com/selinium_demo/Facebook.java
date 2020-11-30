package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;;

public class Facebook {
	WebDriver driver;
	@Test(priority=1)
	public void launch_browser(){
		System.out.println("FACEBOOK");
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
	}
	
	@Test(priority=2)
	public void click_new_account(){
		driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.id("u_1_b")).sendKeys("Naga");
		//driver.findElement(By.name("lastname")).sendKeys("pavan");
		//driver.findElement(By.name("reg_email__")).sendKeys("nagapavan@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
	}
	
	@Test(priority=3)
	public void new_account(){
		
		driver.findElement(By.id("u_1_b")).sendKeys("Naga");
		//driver.findElement(By.name("lastname")).sendKeys("pavan");
		//driver.findElement(By.name("reg_email__")).sendKeys("nagapavan@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
	}
	
	//@AfterTest
//	public  void close_driver(){
	//	driver.close();
	//	System.out.print("Driver is closed");
	//}
}

	