package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Set up system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Test");
	}
	
	@Test
	public void googleFeatureTest() {
		System.out.println("Google Feature Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Google Search Test");
	}
	
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	public void generateReport() {
		System.out.println("Generate Report");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
}
