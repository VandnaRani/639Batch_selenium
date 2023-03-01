package testscenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllHyperLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		List<WebElement> allHyperlinks = driver.findElements(By.tagName("a"));
		System.out.println(allHyperlinks.size());
		 
		for(int i =0;i<allHyperlinks.size();i++) {
			System.out.println(allHyperlinks.get(i).getText());
			
		}
		

	}

}
