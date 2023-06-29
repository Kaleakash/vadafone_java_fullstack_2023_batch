package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;

public class GooglePageTest {
	ChromeDriver driver; 
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\New folder\\chromedriver_win32\\chromedriver.exe");
		  EdgeOptions eo = new EdgeOptions();
		  eo.addArguments("--remote-allow-origins=*");
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver= new ChromeDriver(co);
		  driver.get("file:///C:/Users/akash/Desktop/vadafone_java_fullstack_2023_batch/Phase%205/Selenium%20Programs/Web%20pages/login.html");
	  }	

	  
  @Test
  public void googlePageTest() {
	  driver.get("https://www.google.com");	// open the google page on chrome browser 
	  driver.manage().window().maximize(); // make that pages as maximize size 
	  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));	// set implicit timeout for to do the event. 
	  WebElement textFieldRef = driver.findElement(By.name("q"));
	  
	  textFieldRef.sendKeys("What is testing");
	  WebElement searchButtonKey = driver.findElement(By.name("btnK"));
	  //searchButtonKey.click();
	  searchButtonKey.sendKeys(Keys.ENTER);			// this code mainly use for google search button 
	  try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	  driver.navigate().back();
  }
 
  @AfterTest
  public void afterTest() {
	//driver.close();
  }

}
