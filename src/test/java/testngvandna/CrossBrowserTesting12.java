package testngvandna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting12 {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void browser(@Optional("FireFox") String browserName) {
		
		 if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please give valid browser name ******");
		}
		

	}

	@Test
	public void f() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		
	}
}
