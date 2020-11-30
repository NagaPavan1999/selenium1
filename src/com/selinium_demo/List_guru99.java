package com.selinium_demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class List_guru99 {
	WebDriver driver;
    @BeforeTest
    public void launch_browser() {
         System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
         driver = new ChromeDriver();
	     }
    @Test(priority=1, enabled=true)
    public void login() {
         driver.get("http://demo.guru99.com/test/newtours/register.php");
         driver.manage().window().maximize();
         WebElement register= driver.findElement(By.name("country"));
         Select s1=new Select(register);
         List<WebElement> names = s1.getOptions();
         for(int i=0;i<names.size();i++)
         {
        	 String country_names=names.get(i).getText();
        	 System.out.println("Country names are "+country_names);
         }         
}
}


