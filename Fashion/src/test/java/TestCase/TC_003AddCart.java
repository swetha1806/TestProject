package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.AddCart;
import PageClass.CheckOut;
import PageClass.SignIn;
import PageClass.SignOut;


public class TC_003AddCart {
	WebDriver driver;
	public AddCart ac;
	public CheckOut co;
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
    ac=PageFactory.initElements(driver, AddCart.class);
    co=PageFactory.initElements(driver, CheckOut.class);
    so=PageFactory.initElements(driver, SignOut.class);
		}
	
	@Test
	public void AddProduct() throws InterruptedException
	{
		sin.SignInAccount();
		ac.AddCartTop();
		co.CheckOutPayment("AddCart");
		so.SignOutAccount();
	}
	
	@AfterMethod
	public void SignOut()
	
	{
		//driver.close();
	}
}
