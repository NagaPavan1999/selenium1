package com.selinium_demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P_Annotations {

@BeforeTest
public void Launch_browser(){
System.out.println(" launching browser");
}

@AfterTest
public void close_browser(){
System.out.println(" close browser");
}
@Test(priority=3,enabled=false)
public void facebook(){
System.out.println(" open fb");
}
@Test(priority=1,enabled=false)
public void google(){
System.out.println(" search in google");
}
@Test(priority=2)
public void gmail(){
System.out.println(" gmail login ");
}

}