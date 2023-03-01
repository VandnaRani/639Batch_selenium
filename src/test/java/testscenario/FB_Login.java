package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FB_Login {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		//Type URL into Browser
		driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? hyperlink
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("password")).click();
		

	}


	
	
	
	

		
	}



