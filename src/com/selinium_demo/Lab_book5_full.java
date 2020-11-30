package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Lab_book5_full {
	WebDriver driver;
	
	@BeforeTest()
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Selinium_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Launch_application() throws InterruptedException{
		driver.navigate().to("http://demo.opencart.com/");
		String s1=driver.getTitle();
		
		
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		Thread.sleep(2000);
		String actual_msg=driver.findElement(By.xpath("//*[@id='account-register']/div[1]")).getText();
		String expect="Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(actual_msg, expect);
		   Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	 @Test(dataProvider="names",priority=2)
	 	public void Your_Personal_details(String firstname, String lastname) throws InterruptedException{
	 	
		// driver.navigate().to("http://demo.opencart.com/");
		 //driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
			//driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
			driver.findElement(By.name("firstname")).sendKeys(firstname);
			//String actual_msg0=driver.findElement(By.xpath("//*[@id='account']/div[2]/div/div")).getText();
	 		//String expected_msg0="First Name must be between 1 and 32 characters!";
	 		//Assert.assertEquals(actual_msg0, expected_msg0);
	 		
		       driver.findElement(By.name("lastname")).sendKeys(lastname);
			      Thread.sleep(2000);
		      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      driver.findElement(By.name("email")).sendKeys("nagapavankoda1111@gmail.com");
		      driver.findElement(By.name("telephone")).sendKeys("0125555589");
		      driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		      
		
	}

	 @Test(priority=3)
		public void For_Password() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("0123456789");
		driver.findElement(By.name("confirm")).sendKeys("0123456789");
		 driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		}
	 
	 @Test(priority=4)
		public void For_Newsletter() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		 driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
		 String actual_msg0=driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
	     String expected_msg0="Your Account Has Been Created!";
	     Assert.assertEquals(actual_msg0, expected_msg0);
	     driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();
	     driver.findElement(By.xpath("//*[@id='content']/ul[2]/li[1]/a")).click();
	   
		}
	 
	 @DataProvider(name = "names")
	   
	    public static Object[][] credentials() {
	  
	          return new Object[][] {
	         { "naga012345678901234567890123456734", "naga012345678901234567890123456734" },
	           { "naga01234567890123456789012345633", "naga01234567890123456789012345633" },
	           { "naga0123456789012345678999994532", "naga0123456789012345678999994532" },
	          
	           };
		}
		
}

