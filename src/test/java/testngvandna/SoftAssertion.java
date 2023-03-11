package testngvandna;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
  @Test
  public void f() throws Exception {
	  WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-button")).click();
		Thread.sleep(2000);
		String abc = driver.findElement(By.cssSelector(".oxd-userdropdown-name")).getText();
		Thread.sleep(2000);
		System.out.println(abc);
		Thread.sleep(2000);
		//String expectedName = "Johnnydas da";
		//String expectedName = "JohnnydasAllUAllU dMM";
		//Assert.assertEquals(expectedName,abc);
		Thread.sleep(2000);
		//System.out.println("Test case is Pass");
		
		
		String expectedName = "Paul Collings";
				
				
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedName, abc);
		System.out.println("Test case is Pass");
	
		s.assertAll();


		
		//SoftAssert s = new SoftAssert
				
				
		Assert.assertEquals(expectedName,abc);
		System.out.println("Test case is pass");
		
				
				
				
		
  }
}
