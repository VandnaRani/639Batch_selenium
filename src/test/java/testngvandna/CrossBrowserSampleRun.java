package testngvandna;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.testng.annotations.AfterClass;

public class CrossBrowserSampleRun {
	WebDriver driver;
  @Parameters("browserName")
  @BeforeClass
  public void browser(@Optional("FireFox") String browserName) {
	  if(browserName.equalsIgnoreCase("Firefox")) {
		  driver = new FirefoxDriver();
	  }else if(browserName.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
	  
	 
	  }
  }

  @AfterClass
  public void afterClass() {
  }
  @Test
  public void f() {
	  driver.get("https://www.google.com/");
	  
  }
}
