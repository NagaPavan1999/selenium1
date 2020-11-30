package com.selinium_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reddif {
WebDriver driver;
	//public static void main(String[] args) throws Exception  {
	@Test(priority=1)
	public void launch_browser(){
	System.out.println(" hello selenium ");
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	String str=driver.getTitle();
	System.out.println(str);
	
	} 
	
	@Test(priority=2) 
	public void registartion() throws Exception{
	driver.findElement(By.linkText("REGISTER")).click();
	String str1=driver.getTitle();
	System.out.println(str1);
	//driver.findElement(By.name("firstName")).sendKeys("pravin");
	driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/input")).sendKeys("raghuveer");
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
	
	}
	@Test(priority=3)
	public void login() throws Exception{
	Thread.sleep(2000);
	driver.findElement(By.linkText("sign-in")).click();
	driver.findElement(By.name("userName")).sendKeys("mercury");
	
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
	}
	
	@Test(priority=4) 
	public void find_flights(){
	String s3=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b")).getText();
	System.out.println(s3);
	driver.findElement(By.linkText("Flights")).click();
//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	
	driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	WebElement passenger_cnt=driver.findElement(By.name("passCount"));
	Select s2= new Select(passenger_cnt);
	s2.selectByVisibleText("3");
	//driver.findElement(By.xpath("//form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
	driver.findElement(By.xpath("//input[@value='First']")).click();
	driver.findElement(By.xpath("//input[@src='images/continue.gif']")).click();
	
	}
	
}
