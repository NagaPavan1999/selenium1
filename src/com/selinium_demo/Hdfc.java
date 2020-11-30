package com.selinium_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Hdfc {
	WebDriver driver;
	@Test(priority=1)
	public void launch_browser(){
	System.out.println(" hello selenium ");
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	String str=driver.getTitle();
	System.out.println(str);
	
	} 
	
	@Test(priority=2) 
	public void Cust_id() throws Exception{
		Thread.sleep(2000);
		String str1=driver.getTitle();
		System.out.println(str1);
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("123456789");
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("12345678");
	}
}
