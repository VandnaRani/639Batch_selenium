package testngvandna;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationTest {
  @Test
  public void f() {
	  System.out.println("@Test");
  }
	  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

}