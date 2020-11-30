package com.selinium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames_demo {

WebDriver driver;
//public static void main(String[] args) throws Exception {
@Test
public void Frame_demo() throws Exception{
System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
int how_many_frame=driver.findElements(By.tagName("frame")).size();
System.out.println(how_many_frame);
driver.switchTo().frame("classFrame");
driver.findElement(By.linkText("org.openqa.selenium")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.switchTo().frame("packageListFrame");
driver.findElement(By.linkText("org.openqa.selenium")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
driver.switchTo().frame("packageFrame");
driver.findElement(By.linkText("Alert")).click();
Thread.sleep(2000);
driver.close();

}

}
