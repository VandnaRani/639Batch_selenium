package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Sample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup-link9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup_name")).sendKeys("Abc");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		
		

	}

}
