package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collegeweeklive {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Ojasvi");
		driver.findElement(By.id("lastName")).sendKeys("Dhiman");
		driver.findElement(By.id("emailAddress")).sendKeys("Ojasvi@gmail.com");

		driver.findElement(By.name("phoneNumber")).sendKeys("7742327470");
		driver.findElement(By.name("password")).sendKeys("vani123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("vani123456");
		driver.findElement(By.name("nationality")).sendKeys("united states");
		driver.findElement(By.name("attendeeType")).sendKeys("Parent");
		driver.findElement(By.id("questions[q_134]")).sendKeys("Spring 2023");
		driver.findElement(By.name("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
				  
		driver.findElement(By.name("questions[q_137]")).click();
		driver.findElement(By.id("submit")).click();
		
		
		
		
		
	}

}
