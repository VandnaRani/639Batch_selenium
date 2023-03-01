package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//click on New Window Message button
		
		//driver.findElement(By.id("messageWindowButton")).click();
		
		//click on New Tab button
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(4000);
		
		//Close
		driver.close();
		//driver.quit();
		
	}

}
