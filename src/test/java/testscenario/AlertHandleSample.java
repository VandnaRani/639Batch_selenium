package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleSample {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Alerts.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//driver.findElement(By.id("jbalert")).click();
		//driver.findElement(By.id("jcalert")).click();
		driver.findElement(By.id("jpalert")).click();
		Thread.sleep(3000);
	
		
		
		
		//driver.switchTo().alert().dismiss();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		

	}

}
