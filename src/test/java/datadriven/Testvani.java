package datadriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testvani {
	

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\TestData1.xlsx.xlsx");
		Workbook w =new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(3);
		Cell username = r.getCell(0);
		Cell password = r.getCell(1);
		WebDriver driver = new FirefoxDriver();
  		driver.get("https://www.facebook.com/");
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		driver.findElement(By.id("email")).sendKeys(username.getStringCellValue());
  		driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
  		System.out.println(password.getStringCellValue());
  		
  		
  		
  		
  		
  		
  		
  		

	}

}
