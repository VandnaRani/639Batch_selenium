package datadriven;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataHybridorangehrm {
  @Test
  public void f() throws Exception {
	  FileInputStream fi = new FileInputStream("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\TestData.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("orcm"); 
		//Row number
		
		
		 
		 //Row b = s.getRow(0);
		 //Cell username = b.getCell(0);
		 //Cell password = b.getCell(1);
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		for (int i = 1;i<7;i++) {
			Row b = s.getRow(i);
		driver.findElement(By.name("username")).sendKeys(b.getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(b.getCell(1).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//Validate the given credentials is valid or invalid
		//*[text()= 'Invalid credentials']
		if(driver.findElements(By.xpath("//*[text()= 'Invalid credentials']")).size()>0) {
			System.out.println("The given credentials were Invalid");
		} else {
		System.out.println("Given credentials were valid");
		//Develop code for sign out
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		}
}
}
}