package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;

public class SimpleStaticWebPageTesting {
	ChromeDriver driver;
 @Test
  public void indexPageTest() {
	 WebElement h2TagRef	= driver.findElement(By.tagName("h2"));
	 assertEquals(h2TagRef.getText(), "Welcome to Simple Selenium Testing Hello");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\New folder\\chromedriver_win32\\chromedriver.exe");
	  EdgeOptions eo = new EdgeOptions();
	  eo.addArguments("--remote-allow-origins=*");
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(co);
	  driver.get("file:///C:/Users/akash/Desktop/vadafone_java_fullstack_2023_batch/Phase%205/Selenium%20Programs/Web%20pages/index.html");
  }	

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
