package Selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class ZeroPayBillsTestNG {
	WebDriver driver;
	@BeforeClass
	public void BrowserLogin()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_75\\chromedriver.exe");
	driver= new ChromeDriver();

	driver.get("http://zero.webappsecurity.com/");

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebElement signInbtn=driver.findElement(By.id("signin_button"));
	signInbtn.click();
	WebElement txtLogin=driver.findElement(By.id("user_login"));
	txtLogin.sendKeys("username");

	WebElement txtPassword=driver.findElement(By.id("user_password"));
	txtPassword.sendKeys("password");


	driver.findElement(By.name("submit")).click();
	}
	@Test
	public void PayBill()
	{
	driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Add New Payee')]")).click();
	driver.findElement(By.xpath("//input[@id='np_new_payee_name']")).sendKeys("HydroOne Utility");

	driver.findElement(By.xpath("//textarea[@id='np_new_payee_address']")).sendKeys("200 RoberSpec Pkwy, Mississauga, ON L6R1K9");

	driver.findElement(By.xpath("//input[@id='np_new_payee_account']")).sendKeys("123234434");
	driver.findElement(By.xpath("//input[@id='np_new_payee_details']")).sendKeys("Natural Gas Utility");
	driver.findElement(By.xpath("//input[@id='add_new_payee']")).click();

	}

	@AfterClass
	public void SignOut()
	{
	System.out.println("SignOut");
	//driver.quit();
	}

}
