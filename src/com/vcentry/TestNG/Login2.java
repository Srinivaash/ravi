package com.vcentry.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login2 {
	
	@BeforeSuite
	public void setupscreen2() {
	System.out.println("check whether browser is there");
	System.out.println("check the version of browser");
	}
	@BeforeTest
	public void network2()	{
		System.out.println("check the bandwidth connection");
	}
	@BeforeClass
	public void url2() {
		System.out.println("check whether the url is up");
	}
	@BeforeMethod
	public void homescreen2() {
		System.out.println("check whether Uname password signin button are shown ");
	}
	@Test(groups= {"smoke"})
	public void valid_login_2() {
		System.out.println("Enter valid user name ");
		System.out.println("Enter valid password");
		System.out.println("Enter login button");
	
	}
	@Test(groups= {"smoke"})
	public void invalid_login_2() {
		System.out.println("Enter in-valid user name ");
		System.out.println("Enter in-valid password");
		System.out.println("Enter in-login button");
	}
		@Test
		public void invalid_login_3() {
			System.out.println("Enter in-valid user name ");
			System.out.println("Enter in-valid password");
			System.out.println("Enter in-login button");
		}
			@Test
			public void invalid_login_4() {
				System.out.println("Enter in-valid user name ");
				System.out.println("Enter in-valid password");
				System.out.println("Enter in-login button");
			}
				@Test
				public void invalid_login_5() {
					System.out.println("Enter in-valid user name ");
					System.out.println("Enter in-valid password");
					System.out.println("Enter in-login button");
				
	}
	@AfterMethod
	public void close_url2() {
	System.out.println("close url");
	}
	
	@AfterClass
	public void close_browser2() {
	
	System.out.println("close the browser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
