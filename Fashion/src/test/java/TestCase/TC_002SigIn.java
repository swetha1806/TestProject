package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageClass.SignIn;

public class TC_002SigIn {
	WebDriver driver;
	public SignIn sin;
	@BeforeMethod
	public void BrowserLaunch()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweth\\eclipse-workspace\\Fashion\\src\\test\\resources\\Browser\\chromedriver.exe");
		
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(" http://automationpractice.com/index.php");


	sin=PageFactory.initElements(driver, SignIn.class);

		}
	
	@Test
	public void CreatAccount()
	{
		sin.SignInAccount();	
	}
	
	@AfterMethod
	public void SignOut()
	
	{
		//driver.close();
	}
	
}
