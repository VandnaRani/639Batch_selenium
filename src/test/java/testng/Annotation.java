package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
 import org.testng.annotations.AfterClass;
 
public class Annotation {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");	
	
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");	
	
}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest() {
	
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
	
		System.out.println("After Test");
	}
		
@Test
public void firstTest() {
	System.out.println("Hi,I am your first Test");
}
	
}
