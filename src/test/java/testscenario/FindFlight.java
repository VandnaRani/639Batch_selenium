package testscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindFlight {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("inputName")).sendKeys("Vandna");
		driver.findElement(By.id("address")).sendKeys("2704 sunlight");
		driver.findElement(By.name("city")).sendKeys("Little ELm");
		driver.findElement(By.id("state")).sendKeys("Texas");
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		                                                                               
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("	/html/body/div[2]/div/table/tbody/tr[5]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[6]/td[1]")).getText());
	System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[7]/td[1]")).getText());
	
	}
	}


