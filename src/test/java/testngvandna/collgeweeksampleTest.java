package testngvandna;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class collgeweeksampleTest {
	WebDriver driver;
	@Parameters("browserName")
  
  
  @BeforeClass
  public void browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("FireFox")){
		driver = new FirefoxDriver();
	} else if(browserName.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	} else if(browserName.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	} else {
	System.out.println("Please give browser Data edge/chrome/firefox");
	}
	
}

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  @Test
  public void f() throws Exception {
	  driver.get("https://collegeweeklive.com/go-signup/");
	  Thread.sleep(3000);
	  driver.findElement(By.id("firstName")).sendKeys("Ojasvi");
	  Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Dhiman");
		 Thread.sleep(3000);
		driver.findElement(By.id("emailAddress")).sendKeys("Ojasvi@gmail.com");

}
}