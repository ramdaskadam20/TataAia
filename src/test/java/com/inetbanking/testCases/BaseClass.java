package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
  public String baseURL="https://demo.guru99.com/v4/";
  public String userName="mngr347425";
  public String password="pAgemeb";
  public  static WebDriver driver;
  @BeforeClass
 public void setup()
 {
		 
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();

 }
  @AfterClass
  public void tearDown()
  {
	  driver.quit();
  }
}
