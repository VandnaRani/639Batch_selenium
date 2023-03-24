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



public class DataDrivenTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\src\\test\\java\\TestData.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1"); 
		 
		 Row b = s.getRow(0);
		 Cell username = b.getCell(0);
		 Cell password = b.getCell(1);
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(username.getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
		Thread.sleep(2000);
		
	}

}
