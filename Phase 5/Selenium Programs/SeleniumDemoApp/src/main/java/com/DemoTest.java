package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DemoTest {

	public static void main(String[] args) {
		// We need to load the driver for browser.
		//String key ="webdriver.driverName.driver";
		//String key  = "web.chrome.driver";
		//String value ="C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\chromedriver_win32\\chromedriver.exe";
		// Chrome Browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\New folder\\chromedriver_win32\\chromedriver.exe");
		// Edge Browser 
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\edgedriver_win64\\msedgedriver.exe");
		System.out.println("Set driver property");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		//EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/akash/Desktop/vadafone_java_fullstack_2023_batch/Phase%205/Selenium%20Programs/Web%20pages/index.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
