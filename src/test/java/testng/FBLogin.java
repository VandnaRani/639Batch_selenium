package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLogin {
  @Test
  public void facebook() {
	  
	  WebDriver driver = new ChromeDriver();
		
		//Type URL into Browser
		driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? hyperlink
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("password")).click();
		

	}
  }

