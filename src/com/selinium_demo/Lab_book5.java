package com.selinium_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_book5 {
	 WebDriver driver;
     @Test
     public void launch_browser() throws InterruptedException {
 		System.setProperty("webdriver.chrome.driver","C:\\Selinium_driver\\chromedriver.exe");
 		driver=new ChromeDriver();
    	driver.navigate().to("http://demo.opencart.com/");
 		String s1=driver.getTitle();
 		System.out.println(s1);
 		driver.manage().window().maximize();
 		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
 		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
 		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
 		Thread.sleep(2000);
 		String actual_msg=driver.findElement(By.xpath("//*[@id='account-register']/div[1]")).getText();
 		String expect="Warning: You must agree to the Privacy Policy!";
 		Assert.assertEquals(actual_msg, expect);
      }
     
     @Test(priority=1)
 	public void Your_Personal_details()
 	{
 		driver.navigate().to("http://demo.opencart.com/");
 		driver.manage().window().maximize();
 		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
 		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
 		driver.findElement(By.name("firstname")).sendKeys("Naga12345678901234567890123456789");
 		
 		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
 		/*String actual_msg0=driver.findElement(By.xpath("//*[@id='account']/div[2]/div/div")).getText();
 		String expected_msg0="First Name must be between 1 and 32 characters!";
 		Assert.assertEquals(actual_msg0, expected_msg0);
 		driver.switchTo().defaultContent();
 		driver.findElement(By.name("lastname")).sendKeys("pavan");
 		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
 		String actual_msg1=driver.findElement(By.xpath("//*[@id='account']/div[3]/div/div")).getText();
 		String expect1="Last Name must be between 1 and 32 characters!";
 		Assert.assertEquals(actual_msg1, expect1);
 		driver.findElement(By.name("email")).sendKeys("nagapavan@gmail.com");
 		driver.findElement(By.name("telephone")).sendKeys("1234567890");*/
 	}

     
     
     
}