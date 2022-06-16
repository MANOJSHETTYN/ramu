package TestNG_advance_selenium_elf34;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration_Annotation {
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("After suite");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("After test");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("after method");
	}
	@Test
	public void test(){
		System.out.println("test");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("after class");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("before test");
	}
	@BeforeSuite
	public void beforesuitr(){
		System.out.println("Befre suite");
	}

	
}
