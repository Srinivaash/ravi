package com.vcentry.TestNG;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Home {

	
	
	//homework
	//BeforeSuite
	//@BeforeTest
	//@BeforeClass
	//1st login-class
	//BeforeMethod
	//2 mthod
	//AfterMethod
	//@AfterClass
	//@BeforeClass
	//2nd-home
	//BeforeMethod
	////mthod-1 @Test
	//AfterMethod
	//BeforeMethod
	////mthod-2 @Test
	//AfterMethod
	//@AfterClass
	//@BeforeClass
	//3rd - logout
	//2 mthod
	//@AfterClass
	//@AfterTest
	//AfterSuite
	
	//annotations pre and post conditions
//	@BeforeSuite
//	@AfterSuite
//	@BeforeTest
//	@AfterTest
//	@BeforeClass
//	@AfterClass
//	@BeforeMethod
//	@AfterMethod
	//test case
//	@Test
	
	//assertions
	//Assert
	@BeforeClass
	public void precondition() {
		
		System.out.println("home page should be shown");
		System.out.println("search button should be there");
		
	}
	@BeforeMethod
	public void checkdesign() {
	System.out.println("designs are checked");
	}
	@Test (priority=-5)
	public void CustomerDetails() {
		System.out.println("enter customer name");
		System.out.println("enter customer address");
			
	}
	@AfterMethod 
	
	public void save() {
		System.out.println("save the screen");
	}
	@BeforeMethod
	public void BeforeMethd(){
		System.out.println("888");
	}
	@Test (priority=4)
	public void PaymentDetails() {
		System.out.println("card number");
		System.out.println("enter OTP");
	}	
		@Test (priority=1)
		public void prior1() {
		System.out.println("123r");
		}
		@Test (priority=2)
		public void prior2() {
		System.out.println("456");
		}
		@Test (priority=3)
		public void prior3() {
		System.out.println("789");
		}
	@AfterMethod
	@AfterClass
	public void postcondition() {
		System.out.println("navigate to last screen");
		
	}
	
	


}

