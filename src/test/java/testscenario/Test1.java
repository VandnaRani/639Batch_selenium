package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Texas");
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("United States");
		Thread.sleep(2000);
		driver.findElement(By.id("regdob")).click();
		

	}

}
