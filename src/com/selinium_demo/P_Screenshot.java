package com.selinium_demo;

import java.util.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class P_Screenshot {
 WebDriver driver;
     //public static void main(String[] args) throws InterruptedException {

@Test

public void capturescreen() throws Exception{
         
    System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
    driver = new ChromeDriver();
        // System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
       //  driver = new InternetExplorerDriver();
         driver.manage().window().maximize();
         
         // Pass the url, call the method
         driver.get("http://www.google.com");
         P_Screenshot.captureScreenShot(driver);
         driver.findElement(By.name("q")).sendKeys("SELENIUM  ");
         Thread.sleep(2000);
         P_Screenshot.captureScreenShot(driver);
         driver.close();
         
           }

         public static void captureScreenShot(WebDriver driver1){
         // Take screenshot and store as a file format            
          //File src=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
       File src=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
         
         try {
         // now copy the  screenshot to desired location using copyFile method

         
         FileUtils.copyFile(src, new File("C:\\driver9999\\screenshot\\"+System.currentTimeMillis()+"google.png"));  
       
         }
         catch (IOException e)

         {
           System.out.println(e.getMessage()) ;
         }
         
           }
}