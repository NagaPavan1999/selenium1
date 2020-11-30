package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Lab_book6 {
	WebDriver driver;
	@BeforeTest()
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Selinium_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://demo.opencart.com/");
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.name("email")).sendKeys("nagapavankoda1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("0123456789");
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();

	}
	
	@Test(priority=2)
	public void Steps2_7() throws InterruptedException{
		//2. Go to 'Components' tab and click
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		
		//3. Select 'Monitors'
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
		
		//4. Select 25 from 'Show' dropdown
		Thread.sleep(1000);
		Select dropdown= new Select(driver.findElement(By.xpath("//*[@id='input-limit']")));
		dropdown.selectByVisibleText("25");
		
		//5. Click on 'Add to cart' for the first item
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
		
		//6. Click on 'Specification' tab
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='content']/div[1]/div[1]/ul[2]/li[2]/a")).click();
		
		//7. Verify details present on the page
		//8. Click on 'Add to Wish list' button.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div[2]/div[1]/button[1]/i")).click();
		
		//9. Verify message 'Success: You have added Apple Cinema 30" to your wish list!'
		//String actual_msg0=driver.findElement(By.xpath("//*[@id='product-product']/div[1]")).getText();
	   // String expected_msg0="Success: You have added Apple Cinema 30"+ "to your wish list!";
	  // Assert.assertEquals(actual_msg0, expected_msg0);
		
		}
		
	@Test(priority=3)
	public void Steps10_17() throws InterruptedException{
		//10. Enter 'Mobile' in ' Search' text box
		driver.findElement(By.name("search")).sendKeys("Mobile");
		Thread.sleep(1000);
		//11. Click on 'Search' button
		driver.findElement(By.xpath("//*[@id='search']/span/button")).click();
		Thread.sleep(1000);
		
		//12. Click on 'Search in product descriptions' check box
		driver.findElement(By.id("description")).click();
		driver.findElement(By.xpath("//*[@id='button-search']")).click();
		Thread.sleep(1000);
		
		//13. Click on link 'HTC Touch HD' for the mobile 'HTC Touch HD'
		driver.findElement(By.linkText("HTC Touch HD")).click();
		Thread.sleep(1000);
		
		//14. Clear '1' from 'Qty' and enter '3'
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("3");
		Thread.sleep(1000);
		
		//15. Click on 'Add to Cart' button
		driver.findElement(By.xpath("//*[@id='button-cart']")).click();
		Thread.sleep(1000);
		
		//16. Verify success message 'Success: You have added HTC Touch HD to your shopping cart!'
		//String actual_msg1=driver.findElement(By.xpath("//*[@id='product-product']/div[1]")).getText();
		 //  String expected_msg1="Success: You have added HTC Touch HD to your shopping cart!";
		    // Assert.assertEquals(actual_msg1, expected_msg1);
		     
		  //  17. Click on 'View cart' button adjacent to search button
		     driver.findElement(By.xpath("//*[@id='cart']/button")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")).click();
		   
	}
	
	@Test(priority=4)
	public void Step18_23() throws InterruptedException{
		
		//18. Verify Mobile name added to the cart
		//String actual_msg1=driver.findElement(By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[2]/a")).getText();
		 // String expected_msg1="HTC Touch HD";
		  //  Assert.assertEquals(actual_msg1, expected_msg1);
		   

		//19. Click on 'Checkout' button
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a")).click();
		   System.out.println("checkout is clicked");
		   
		//20. Click on 'My Account' dropdown
		   driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		   Thread.sleep(1000);
		   
		//21. Select 'Logout' from dropdown
		   driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
		   Thread.sleep(1000);
		   
		 //22. Verify 'Account Logout' heading
		   String actual_msg2=driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
			  String expected_msg2="Account Logout";
			    Assert.assertEquals(actual_msg2, expected_msg2);
		  
		//23. Click on 'Continue
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
		//*[@id="content"]/div/div/a
	}
	
	
}
