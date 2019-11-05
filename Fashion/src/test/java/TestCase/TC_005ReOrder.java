package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.CheckOut;
import PageClass.ReOrder;
import PageClass.SignIn;
import PageClass.SignOut;


public class TC_005ReOrder {
	WebDriver driver;
	public SignIn sin;
	public ReOrder ro;
	public CheckOut co;
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
    ro=PageFactory.initElements(driver, ReOrder.class);
    co=PageFactory.initElements(driver, CheckOut.class);
    so=PageFactory.initElements(driver, SignOut.class);
		}
	
	@Test
	public void AddProductWishList() throws InterruptedException
	{
		sin.SignInAccount();
		ro.ReOrderProduct();
		co.CheckOutPayment("ReOrder");
		so.SignOutAccount();
	}
	
	@AfterMethod
	public void SignOut()
	
	{
		//driver.close();
	}
}
