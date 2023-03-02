package testngvandna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigational {
  @Test
  public void Navigation() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup-link9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup_name")).sendKeys("Abc");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
  }
}
