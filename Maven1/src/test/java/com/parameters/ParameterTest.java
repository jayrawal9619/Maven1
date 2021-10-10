package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("url")
		public void setup(String url) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jayra\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver(); // Dynamic Polymorphism
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		}
		
	@Test
	@Parameters({"username"})
	public void yahooLoginTest(String username) {
		driver.findElement(By.xpath("//a[@class='_yb_525gw']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	
	}
			
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}	
	
}
