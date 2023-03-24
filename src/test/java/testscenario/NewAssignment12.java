package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewAssignment12 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.riamoneytransfer.com/en-us/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class ='sc-860370ce-0 bXPWVw']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='flag-container' ]) [3]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ value = '100.00']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@ value = '100.00']"));
		element.clear();
		element.sendKeys("250");
		Thread.sleep(1000);
		
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div/div/div[2]/div/div/form/div[1]/div/div/div/div")).click();
		
	}//*[@id="__next"]/main/section[1]/div/div/div[2]/div/div/form/div[2]/input
	

}
