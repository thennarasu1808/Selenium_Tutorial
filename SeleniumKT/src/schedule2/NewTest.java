package schedule2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
  @Test
  public void test1() {
	  System.out.println("Am test 1");
  }
  
	
  @Test
  public void test2() {
	  System.out.println("Am test 2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am after class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("i am before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("i am after suite");
  }

}
