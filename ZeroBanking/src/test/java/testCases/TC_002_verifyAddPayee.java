package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageclass.AccountSummaryPage;
import pageclass.LoginPage;
import pageclass.PayBillsPage;
import pageclass.WelcomePage;

public class TC_002_verifyAddPayee {
	public WebDriver driver;
	public LoginPage lp;
	public	WelcomePage wp;
	public PayBillsPage pb;
	public AccountSummaryPage as;

	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\zerobanking\\src\\test\\resources\\browser_driver\\chromedriver.exe");
	driver=new ChromeDriver();
	   driver.get("http://zero.webappsecurity.com/index.html");	
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   wp=PageFactory.initElements(driver, WelcomePage.class);
	   lp=PageFactory.initElements(driver, LoginPage.class);
	   pb=PageFactory.initElements(driver, PayBillsPage.class);
	   as=PageFactory.initElements(driver, AccountSummaryPage.class);
	}

	@Test
	public void AddPAyee()
	{
	wp.clickSignInBtn();
	 
	  lp.doLogin("username", "password");
	as.PayBillBtnSelect();
	pb.ClickAddNewPayee();
	pb.AddPayee("HydroOne Utility","200 RoberSpec,Pwy Mississauga, ON L6R1K9","123234434","Natural Gas Utility");
	}
	@AfterClass
	public void tearDown()
	{
	driver.quit();

	}

}
