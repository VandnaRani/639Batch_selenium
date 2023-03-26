package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataFacebook {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\TestData.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Facebook");
		
		//Row b = s.getRow(1);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		for (int i = 1;i<3;i++) {
			Row b = s.getRow(i);
		driver.findElement(By.id("email")).sendKeys(b.getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys(b.getCell(1).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		//Validation message
		if(driver.findElements(By.partialLinkText("Find your account and log in.")).size()>0){
			System.out.println("The given credentials were Invalid");
		}else {
			System.out.println("The given credentials were valid");
			
			
		}
		Thread.sleep(1000);
		}
	}}
