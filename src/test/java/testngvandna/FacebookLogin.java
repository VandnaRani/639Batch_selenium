package testngvandna;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
	public void f() throws Exception {

		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.findElement(By.id("email")).sendKeys("abc@123456");
		//driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		//driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText(),
				//"The email or mobile number you entered isn’t connected to an account. Find your account and log in.");
		//Thread.sleep(3000);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc@123456");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error_box\"]/div[2]")).getText());
		 Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\\\"error_box\\\"]/div[2]")).getText(),"Invalid username or password");
		  // Assert.assertTrue(driver.findElement(By.className("_9ay7")).getText().endsWith("ve entered is incorrect. Forgot Password?"));

		
	}
}
