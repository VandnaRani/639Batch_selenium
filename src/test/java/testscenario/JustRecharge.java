package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRecharge {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("vani@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("vani123456");
		driver.findElement(By.id("txtCaptcha")).sendKeys("19");
		driver.findElement(By.name("imgbtnSignin")).click();
		
		
	}

}
