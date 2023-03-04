package testngvandna;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
  @Test
  public void f() throws InterruptedException,Exception {
	  WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//send screen shot to specific location.
	FileHandler.copy(abc,new File("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\ScreenShot1.png"));
  }
}