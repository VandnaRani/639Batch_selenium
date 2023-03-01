package testscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.cssSelector("input#email")).sendKeys("Vani@gmail.com");
driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Vani@gmail.com");
driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Vani@gmail.com");

	}

}
