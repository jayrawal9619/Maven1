package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test()
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("home test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search page test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void registrationPage() {
		System.out.println("Registration page test");
	}
	
	
}
