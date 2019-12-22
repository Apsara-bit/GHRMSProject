package seleniumdemooffb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class TestNGdemo2 {

	@Test(priority=2,dependsOnMethods = "edit")
	public void login() {
		System.out.println("login module");
	}

	@Test(priority=3)
	public void edit() {
		System.out.println("editing module");
	}
	
	@Test(priority=1,invocationCount=3)
	public void update() {
		System.out.println("new module");
	}
	
	@Test(timeOut=3000)
	public void delete() throws InterruptedException {
}
	
	@Test(groups="TestNG")
	public void verify() {
		System.out.println("verify module");
	}
	
	@Test(groups="TestNG")
	public void verify1() {
		System.out.println("verify1 module");
	}
	
	@Test(dependsOnGroups="TestNG")
	public void verify2() {
		System.out.println("verify2 module");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}

	@BeforeMethod
	public void Beforemethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void Aftermethod() {
		System.out.println("aftermethod");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}

	@BeforeSuite
	public void bsuite() {
		System.out.println("bsuite");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("asuite");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" afterClass");

	}
}
