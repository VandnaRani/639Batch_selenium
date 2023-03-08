package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeek2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Assam");
		//driver.findElement(By.id("regdob")).sendKeys("02/08/1983");
		//driver.findElement(By.linkText("8")).click();
	}

}
