package com.selinium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P_Alert {

WebDriver driver;
@BeforeTest
public void launch_browser(){
System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@Test

public void rediff_alert_handling() throws Exception{
driver.findElement(By.name("proceed")).click();
Alert al=driver.switchTo().alert();
String str=al.getText();
System.out.println(str);
Assert.assertEquals(str, "Please enter a valid user name");
System.out.println("test passed");
Thread.sleep(3000);
al.accept();
//al.dismiss(); // cancel
driver.findElement(By.id("login1")).sendKeys("pravin");


}

@Test(priority=2)

public void registration(){
System.out.println(" registration done ");

}

@AfterTest
public void close_browser(){
//driver.quit();
}

}