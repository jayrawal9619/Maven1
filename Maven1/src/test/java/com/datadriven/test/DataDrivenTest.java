package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\jayra\\eclipse-workspace\\Maven1\\src\\test\\java\\com\\testdata\\TestData.xls.xlsx");
		
		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastName);
		
		String email = reader.getCellData("RegTestData", "email", 2);
		System.out.println(email);
		
		String password = reader.getCellData("RegTestData", "password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jayra\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver(); // Dynamic Polymorphism
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&AppName=LithiumT-7567-42e3-a620-0b7cf8ee50ee&ru=https%3A%2F%2Fauth.ebay.com%2Foauth2%2Fconsents%3Fclient_id%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26redirect_uri%3DLithium_Technol-LithiumT-7567-4-khvro%26scope%26state%3DR3b9T293MPvfrBCBjUNF3hWvwyTFBSPDhLzH__POvINClOjZ_AaSnoxstGnt6v_N7vRz1gsldniqAhgAXdv5VVpGTT3QRhGNWtL3sioDivxOX-jxUQzWzVNCl13TO9xViLM8ecg6NzR1AIZ8VPMIDP5NcDEG4YJg6s3UjmJ7ihFZVv_lUcljjEScK6vSP58RVspae3b-zsro3s1_8FoRQA%26response_type%3Dcode%26hd%26consentGiven%3Dfalse&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26AppName%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26ru%3Dhttps%253A%252F%252Fauth.ebay.com%252Foauth2%252Fconsents%253Fclient_id%253DLithiumT-7567-42e3-a620-0b7cf8ee50ee%2526redirect_uri%253DLithium_Technol-LithiumT-7567-4-khvro%2526scope%2526state%253DR3b9T293MPvfrBCBjUNF3hWvwyTFBSPDhLzH__POvINClOjZ_AaSnoxstGnt6v_N7vRz1gsldniqAhgAXdv5VVpGTT3QRhGNWtL3sioDivxOX-jxUQzWzVNCl13TO9xViLM8ecg6NzR1AIZ8VPMIDP5NcDEG4YJg6s3UjmJ7ihFZVv_lUcljjEScK6vSP58RVspae3b-zsro3s1_8FoRQA%2526response_type%253Dcode%2526hd%2526consentGiven%253Dfalse");
	
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);	
				
	}
	
	}
