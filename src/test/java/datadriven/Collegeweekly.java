package datadriven;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.security.Password;
import org.testng.annotations.Test;

public class Collegeweekly {
  @Test
  public void test() throws Exception {
	  FileInputStream fi = new FileInputStream("C:\\Users\\uvoja\\639Batch\\Selenium_vandna\\TestData.Xlsx");
	  Workbook b = new XSSFWorkbook(fi);
	  Sheet c = b.getSheet("Sheet1");
	  Row d = c.getRow(1);
	  Cell FirstName = d.getCell(0);
	  Cell LastName = d.getCell(1);
	  Cell Email = d.getCell(2);
	  Cell Mobilenumber = d.getCell(3);
	  Cell Password = d.getCell(4);
	  Cell Country = d.getCell(5);
	  Cell name = d.getCell(6);
	  WebDriver driver = new FirefoxDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys(FirstName.getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys(LastName.getStringCellValue());
		driver.findElement(By.id("emailAddress")).sendKeys(Email.getStringCellValue());
driver.findElement(By.id("phoneNumber")).sendKeys(Mobilenumber.getStringCellValue());
driver.findElement(By.id("password")).sendKeys(Password.getStringCellValue());
new Select(driver.findElement(By.id("country"))).selectByVisibleText("UNITED STATES");
new Select (driver.findElement(By.name("attendeeType"))).selectByVisibleText("Current Undergraduate Student Looking to Transfer");

  }
}
