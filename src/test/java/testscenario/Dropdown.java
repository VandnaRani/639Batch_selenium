package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.id("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.id("number"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("products"))).selectByVisibleText("Iphone");
		Thread.sleep(6000);
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
				
				
				
				
				
				

	}

}
