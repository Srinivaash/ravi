package com.vcentry.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeSuite
	public void setupscreen() {
	System.out.println("check whether browser is there");
	System.out.println("check the version of browser");
	}
	@BeforeTest
	public void network()	{
		System.out.println("check the bandwidth connection");
	}
	@BeforeClass
	public void url() {
		System.out.println("check whether the url is up");
	}
	@BeforeMethod
	public void homescreen() {
		System.out.println("check whether Uname password signin button are shown ");
	}
	@Test
	public void valid_login() {
		System.out.println("Enter valid user name ");
		System.out.println("Enter valid password");
		System.out.println("Enter login button");
	
	}
	@Test
	public void invalid_login() {
		System.out.println("Enter in-valid user name ");
		System.out.println("Enter in-valid password");
		System.out.println("Enter in-login button");
			
	}
	@AfterMethod
	public void close_url() {
	System.out.println("close url");
	}
	
	@AfterClass
	public void close_browser() {
	
	System.out.println("close the browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
