package TestCase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.CreateAccount;

public class TC_001CreateAccount {
	WebDriver driver;
	public CreateAccount create;
	@BeforeMethod
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweth\\eclipse-workspace\\OpenSourcecmsProject\\src\\test\\resources\\Browser\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(" http://automationpractice.com/index.php");


	create=PageFactory.initElements(driver, CreateAccount.class);

		}
	
	@Test
	public void CreatAccount()
	{
		create.CreateNewAccount();	
	}
	
	@AfterMethod
	public void SignOut()
	
	{
		driver.close();
	}
	
}
