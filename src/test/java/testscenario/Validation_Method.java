package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Validation_Method {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/uvoja/Downloads/QE%20-%20index.html");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//driver.findElement(By.id("test5-button")).click();
		//System.out.println(driver.findElement(By.id("test5-alert")).getText());
		//Assert.assertTrue(driver.findElement(By.id("test5-button")).isEnabled()==false);

		driver.findElement(By.id("test5-button")).click();
		Thread.sleep(1000);
		Assert.assertEquals("You clicked a button!",driver.findElement(By.id("test5-alert")).getText());

		System.out.println("You clicked a button!");
		Assert.assertTrue(driver.findElement(By.id("test5-button")).isEnabled()==false);
		driver.quit();
		
		
	}
}