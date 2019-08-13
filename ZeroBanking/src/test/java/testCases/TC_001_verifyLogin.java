package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageclass.LoginPage;
import pageclass.WelcomePage;

public class TC_001_verifyLogin {
	public WebDriver driver;
	public LoginPage lp;
	public	WelcomePage wp;

	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweth\\eclipse-workspace\\ZeroBanking\\src\\test\\resources\\browser_driver\\chromedriver.exe");
	driver=new ChromeDriver();
	   driver.get("http://zero.webappsecurity.com/index.html");	
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   wp=PageFactory.initElements(driver, WelcomePage.class);//intialising our welcome page
	   lp=PageFactory.initElements(driver, LoginPage.class);//intialising our login page
	}
	@Test
	public void verifyLogin()
	{

	wp.clickSignInBtn();
	 
	  lp.doLogin("username", "password");
	  
	}
	@AfterClass
	public void tearDown()
	{
	driver.quit();
	}

}
