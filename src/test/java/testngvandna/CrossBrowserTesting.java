package testngvandna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		} else {
			System.out.println("Please give valid browser name ******");
		}

	}

	@Test
	public void f() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello Selenium");
		
		
	}
}
