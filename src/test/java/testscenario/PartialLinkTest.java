package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTest {

	public static void main(String[] args)   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		
		//Using LinkText
		
		driver.findElement(By.linkText("Sign in")).click();
		//Using Partial LinkText
		//driver.findElement(By.partialLinkText("password")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText(" password?")).click();
		
		

		
		//Type URL into Browser
		//driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? hyperlink
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("ssw")).click();
		

	}

}

	


