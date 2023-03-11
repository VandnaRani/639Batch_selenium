package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class fB_login12 {

	public static void main(String[] args) throws Exception {
		


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("ddggff");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		Assert.assertTrue(driver.findElement(By.className("_9ay7")).getText().startsWith("The password you"));
		Assert.assertTrue(driver.findElement(By.className("_9ay7")).getText().endsWith("ve entered is incorrect. Forgot Password?"));
		
		
		
		
		
		



		
		

	}

}
