package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
		@Test
		public void firstTest() throws Exception {
			System.out.println("Hi,I am from first Test");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("Button2")).click();
			System.out.println(driver.switchTo().alert().getText());
		
	
	
	}
		

}
 