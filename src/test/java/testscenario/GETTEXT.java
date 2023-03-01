package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTEXT {

	public static void main(String[] args) throws Exception  {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		System.out.println(driver.findElement(By.className("_8eso")).getText());
		Thread.sleep(3000);
		
		
	}

}
