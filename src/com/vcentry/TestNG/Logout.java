package com.vcentry.TestNG;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.AfterSuite;
public class Logout {

	
	
	@BeforeClass
	public void beforeMethod() {
	System.out.println("beforeclass");
	}
	@Test
	public void logoutscreen() {
		System.out.println("navigateto last screen name");
		System.out.println("click logout");
			
	}
	@Test(groups= {"smoke"})
	public void PaymentDetails_2() {
		System.out.println("card number");
		System.out.println("enter OTP");
			
	}
	@AfterClass
	public void save() {
		System.out.println("navigate to last screen");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("after suite");
	}
	
	
	
	
	
	
	
}
