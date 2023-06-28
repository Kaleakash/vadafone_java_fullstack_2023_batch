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

public class LoginTest {
	ChromeDriver driver;
	 @Test
	  public void indexPageTest() {
		WebElement emailidREf = driver.findElement(By.id("n1"));
		WebElement passwordREf = driver.findElement(By.id("n2"));
		emailidREf.sendKeys("akash@gmail.com");
		passwordREf.sendKeys("1234");
		WebElement submitButtonRef = driver.findElement(By.id("b1"));
		submitButtonRef.click();
		WebElement h2TagREf = driver.findElement(By.tagName("h2"));
		assertEquals(h2TagREf.getText(), "Welcomem to Home page");
	  }
	  
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

	  @AfterTest
	  public void afterTest() {
		driver.close();
	  }

}
