package testngvandna;

import org.testng.annotations.Test;

public class Priority {
  @Test
  public void Tc_02() {
	  System.out.println("@Test K");
  }
  @Test
  public void Tc_04() {
	  System.out.println("@Test B"); 
  }
  @Test
  public void Tc_03() {
	  System.out.println("@Test c"); 
	  
}
  
  @Test
  public void Tc_01() {
	  System.out.println("@Test d"); 
}
}