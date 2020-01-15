package sampleTest;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project1 {

	@Test
	public void testcase1() {
		System.out.println("Test");
	}
	
	@Test
	public void testcase10() {
		System.out.println("Test2");
	}

	@BeforeTest
	public void testcase2() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void testcase3() {
		System.out.println("@AfterTest");
	}

	@BeforeMethod
	public void testcase4() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void testcase5() {
		System.out.println("@AfterMethod");
	}

	@Test
	public void testcase6() {
		System.out.println("@BeforeClass");
		
	}

	@AfterClass
	public void testcase7() {
		System.out.println("@AfterClass");
	}

	@BeforeSuite
	public void testcase8() {
		System.out.println("@BeforeSuite");
	}

	@AfterSuite
	public void testcase9() {
		System.out.println("@AfterSuite");
	}

}
