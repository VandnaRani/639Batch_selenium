package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

         driver.findElement(By.linkText("Sign Up")).click();
         Thread.sleep(6000);
         driver.findElement(By.id("entity")).click();
       
         driver.findElement(By.name("name")).sendKeys("DAV");

	}

}
