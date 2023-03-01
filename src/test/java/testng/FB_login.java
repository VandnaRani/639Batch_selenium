package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_login {
	@Test
	public void facebook() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.partialLinkText("Forgot password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("vani@gmail.com");
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")).getText());
		
		
	
	
}
}