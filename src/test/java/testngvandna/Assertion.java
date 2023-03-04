package testngvandna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void Assertion() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  //driver.get("https://collegeweeklive.com/go-signup/");
	  //Thread.sleep(6000);
	  //driver.findElement(By.id("submit")).click();
	  Thread.sleep(2000);
	  //Assert.assertEquals("Please enter your first name.",driver.findElement(By.className("formValidationMessage")).getText());
	//System.out.println("End of program,Test case is Pass");
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(6000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	Thread .sleep(2000);
	
	String abc = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
	 //String expectedName = "paul mamboo";
	String expectedName = "paul mambo";
	 Assert.assertEquals(expectedName,abc);
	 		
	 		
	 	
	 		
		System.out.println("abc");
	
	  
		
  }
}
