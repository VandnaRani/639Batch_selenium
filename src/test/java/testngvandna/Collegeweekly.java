package testngvandna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Collegeweekly {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Ojasvi");
		driver.findElement(By.id("lastName")).sendKeys("Dhiman");
		driver.findElement(By.id("emailAddress")).sendKeys("Ojasvi@gmail.com");

  }
}
