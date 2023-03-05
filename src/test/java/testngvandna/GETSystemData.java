package testngvandna;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETSystemData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();

		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		Date currentDate = new Date();
		DateFormat df =  new SimpleDateFormat("MMDDYY_HHmmss");
		System.out.println(df.format(currentDate));
		

	}

}
