package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Lab_book4 {
	
	WebDriver driver;
	@BeforeTest()
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Selinium_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.opencart.com/");
	}

}
