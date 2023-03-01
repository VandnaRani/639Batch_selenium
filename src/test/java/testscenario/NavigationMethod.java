package testscenario;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.get("https://blazedemo.com");
 driver.manage().window().maximize();
 Thread.sleep(3000);
 new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
 new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
 
 driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
 
 driver.findElement(By.id("inputName")).sendKeys("Ranju kumari");
 Thread.sleep(3000);
 driver.findElement(By.id("address")).sendKeys("3578 North faiemont circul");
 driver.findElement(By.id("city")).sendKeys("Coliervill");
 driver.findElement(By.id("state")).sendKeys("Memphis");
 driver.findElement(By.id("zipCode")).sendKeys("345678");
 
 new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
 
 driver.findElement(By.id("creditCardNumber")).sendKeys("2115367383823893");
 driver.findElement(By.id("creditCardMonth")).clear();
 
 driver.findElement(By.id("creditCardMonth")).sendKeys("11");
 driver.findElement(By.id("creditCardYear")).clear();
 
 driver.findElement(By.id("creditCardYear")).sendKeys("2020");
 driver.findElement(By.id("nameOnCard")).sendKeys("Ranju Kumari");
 
 Thread.sleep(6000);
 driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
 
 
 
 
 
	}


	}


