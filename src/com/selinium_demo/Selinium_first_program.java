package com.selinium_demo;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selinium_first_program {
	public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Selinium_driver\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/newtours/");
}
}
