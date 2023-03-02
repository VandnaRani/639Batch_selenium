package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHAndle {
  @Test
  public void AlertHAndle() throws Exception  {
	  
  WebDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("Button2")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}

}


