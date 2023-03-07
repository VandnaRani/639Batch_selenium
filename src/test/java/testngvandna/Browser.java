package testngvandna;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  WebDriver driver = new ChromeDriver();
	  driver = new FirefoxDriver();
	  Thread.sleep(2000);
	  driver = new EdgeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	  driver.get("https://collegeweeklive.com/go-signup/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	  
  }
}
