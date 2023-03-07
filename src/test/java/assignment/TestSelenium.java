package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestSelenium {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.applevacations.com/#!/");
		checkforoffer(driver);
		//driver.findElement(By.id("scc_rt_submit")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("AppleVacations-58158")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(1000);
		//driver.findElement(By.id("bx-element-1820631-ZvEWpmB")).click();
		
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("My Account")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign In")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(1000);
		//driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_UserName")).sendKeys("uvojasvi@gmail.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(1000);
		//driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password")).sendKeys("vandna12");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Thread.sleep(1000);
		//driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_RequestPasswordResetToken")).click();
		
		
		
		//driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton")).click();
	
		Thread.sleep(2000);
	
		
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.applevacations.com/#!/");
		checkforoffer(driver);
		
		driver.findElement(By.id("scc_rt_submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		//driver.findElement(By.id("bx-close-inside-1820631")).click();
		
		driver.findElement(By.id("AppleVacations-58158")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("bx-close-inside-1820631")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		
		Assert.assertEquals("Please enter the email address you registered with.",driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_UserName_popupTable")).getText());
		Thread.sleep(1000);
		driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password")).click();
		Thread.sleep(1000);
		Assert.assertEquals("Password can not be blank",driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password_popupTable")).getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(1000);
		
		
		
		
		//Thread.sleep(1000);
		
		

		 
		
		
		//WebDriver driver = new ChromeDriver();
				driver.get("https://www.applevacations.com/#!/");
				checkforoffer(driver);
				
				driver.findElement(By.id("scc_rt_submit")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				driver.findElement(By.id("bx-close-inside-1820631")).click();
				
				driver.findElement(By.id("AppleVacations-58158")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				driver.findElement(By.linkText("My Account")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(1000);
				driver.findElement(By.linkText("Sign In")).click();
				driver.findElement(By.id("bx-close-inside-1820631")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_UserName")).sendKeys("abc@gmail.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password")).sendKeys("123");
				Thread.sleep(1000);
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(1000);
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				
				driver.get("https://www.applevacations.com/#!/");
				checkforoffer(driver);
				driver.findElement(By.id("scc_rt_submit")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
driver.findElement(By.linkText("My Account")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(1000);
				driver.findElement(By.linkText("Sign In")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(1000);
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_UserName")).sendKeys("uvojasvi@gmail.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password")).sendKeys("vandna12");
				Thread.sleep(1000);
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(1000);
				driver.findElement(By.id("ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				driver.findElement(By.linkText("My Account")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				Thread.sleep(2000);
				driver.findElement(By.id("logoutlink")).isDisplayed();
				Thread.sleep(2000);
		
		
		
		
		driver.get("https://www.applevacations.com/#!/");
		checkforoffer(driver);
		driver.findElement(By.id("scc_rt_vendorpackage_1_H01")).click();

		driver.findElement(By.id("desAC_value")).sendKeys("Dallas");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"desAC_dropdown\"]/div[3]/div")).click();
		WebElement element = driver.findElement(By.id("depDT_value"));
		element.clear();
		element.sendKeys("3/10/2023");
		
		
			
		driver.findElement(By.id("retDT_value")).getText();	
		driver.findElement(By.cssSelector(".passengersCount")).click();
		new Select (driver.findElement(By.id("scc_rt_passengers_numrooms"))).selectByVisibleText("2 Rooms");
				
		new Select (driver.findElement(By.id("passengers_1_adults"))).selectByVisibleText("2 Adults");
		driver.findElement(By.id("scc_rt_submit")).click();
		
		WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement firsthotel= waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("lnkHotelTileClick0")));
		firsthotel.click();
		//Wait for the new window or tab
		//waiter.until(numberOfWindowsToBe(2));
		String originalWindow = driver.getWindowHandle();

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		driver.findElement(By.name("hotelRoomBtn")).click();
		//Switch Window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		//click name=hotelRoomBtn
		
		driver.findElement(By.name("hotelComponentBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		//wait until id=ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_ctl02_ctl02_insuranceOptions_insurancePrompt_0 then click
		driver.findElement(By.cssSelector(".continue-booking-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(2000);
		//click css = .continue-booking-button
		waiter   = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement TravelProtection= waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_ctl02_ctl02_insuranceOptions_insurancePrompt_0")));
		TravelProtection.click();
		Thread.sleep(5000);
		waiter   = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement Continue = waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".continue-booking-button")));
		Continue.click();
		driver.findElement(By.id("summaryCartContinueBtn")).click();
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_FirstName")).sendKeys("vandna");
	driver.findElement(By.className("middleInitialField")).sendKeys("VR");
driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_LastName")).sendKeys("Dhiman");
	driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_LeadPassenger_PhoneNo")).sendKeys("8474716050");
driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_LeadPassenger_MobileNo")).sendKeys("7742327470");	driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_LeadPassenger_EmailAddress")).sendKeys("uvojasvi@gmail.com");
				 Thread.sleep(3000);
driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_FirstName")).sendKeys("Utkarsh");
Thread.sleep(1000);
driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_MiddleInitial")).sendKeys("UT");
driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_LastName")).sendKeys("Dhiman");

driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl00_pi_FirstName")).sendKeys("ojasvi");

		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl00_pi_MiddleInitial")).sendKeys("ojas");
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl00_pi_LastName")).sendKeys("Dhiman");
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl01_pi_FirstName")).sendKeys("Vani");
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl01_pi_MiddleInitial")).sendKeys("VN");
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl01_pi_LastName")).sendKeys("Dhiman");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_submit")).click();
		    
		    }
	
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_FirstName
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_MiddleInitial
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl00_pi_FirstName
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl00_TravelerInput_pr_ctl01_pi_FirstName
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl00_pi_FirstName
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl01_pi_FirstName
	//ctl00_ctl01_ContentPlaceHolder_ContentPlaceHolder_TravelerInfotool_TravelersInput_RptTravelers_ctl01_TravelerInput_pr_ctl01_pi_LastName

	private static void checkforoffer(WebDriver driver) throws InterruptedException {
		try {
		WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement close= waiter.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#bx-element-1820631-B7dy9qj button")));
		if(close !=null) {
			Thread.sleep(1000);
			close.click();
		}}
		catch(Exception ex){}
	}
	
	
	
	
		    }	
	
		
	

//*[@id="angular-res-tool-block-0cce6bec-fd7a-40e4-bc88-3b9e2e722019"]/div/div/fieldset/div[6]/div/div[8]/div[2]/span[1]
