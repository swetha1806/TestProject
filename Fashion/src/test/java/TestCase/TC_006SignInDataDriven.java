package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.SignIn;
import PageClass.SignOut;

public class TC_006SignInDataDriven {
	WebDriver driver;
	public SignIn sin;
	public SignOut so;
	@BeforeMethod
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweth\\eclipse-workspace\\OpenSourcecmsProject\\src\\test\\resources\\Browser\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(" http://automationpractice.com/index.php");


	sin=PageFactory.initElements(driver, SignIn.class);
	so=PageFactory.initElements(driver, SignOut.class);
		}
	
	@Test
	public void SignInAccountDataDriven() throws IOException
	{
File src = new File("C:\\Users\\sweth\\eclipse-workspace\\Fashion\\LoginDetails.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		for(int i=0; i<=rowCount; i++) {
			
			
			sin.SigInData(sheet.getRow(i).getCell(0).getStringCellValue(), sheet.getRow(i).getCell(1).getStringCellValue());
			so.SignOutAccount();
		}
		wb.close();

	
	}
	
	@AfterMethod
	public void SignOut()
	
	{
		//driver.close();
	}
	
}
