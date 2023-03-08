package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleSample {

	public static void main(String[] args) throws Exception  {
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://stqatools.com/demo/Alerts.php");
		//Thread.sleep(2000);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
		//driver.findElement(By.id("jbalert")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//driver.switchTo().alert().dismiss();
		
		//Thread.sleep(1000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(3000);
		//driver.findElement(By.id("jcalert")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//driver.switchTo().alert().dismiss();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(3000);
		//driver.findElement(By.id("jpalert")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(3000);
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Alerts.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.id("jbalert")).click();
		
		Thread.sleep(6000);
		System.out.println(driver.switchTo().alert().getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("jcalert")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("jpalert")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().alert().accept();
		
		
		//Thread.sleep(3000);
		
		
		
		
		
		

	}

}
