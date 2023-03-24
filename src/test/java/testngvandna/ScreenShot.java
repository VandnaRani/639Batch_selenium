package testngvandna;

import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class ScreenShot {
  @Test
  public void f() throws InterruptedException,Exception {
	  WebDriver driver = new FirefoxDriver();

		driver.get("https://Amazon.com");
		Thread.sleep(4000);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//time stamp
		Date currentDate = new Date();
		DateFormat df = new SimpleDateFormat("MMDDYY HHmmss");
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//send screen shot to specific location.
	FileHandler.copy(abc,new File(".\\Screenshots\\test"+df.format(currentDate)+".png"));
	
}
}