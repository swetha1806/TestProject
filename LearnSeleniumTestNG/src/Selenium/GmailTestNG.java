package Selenium;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class GmailTestNG {
	WebDriver driver;
	@BeforeClass
	public void BrowserLogin()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_75\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://gmail.com");
	}
	@Test(priority=1)
	public void sign() throws InterruptedException
	{
	driver.findElement(By.id("identifierId")).sendKeys("demomailswetha",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("DemoMail123*",Keys.ENTER);

	Thread.sleep(4000);
	}
	@Test(priority=2)
	public void AttachmentOfFile() throws InterruptedException, IOException
	{
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("swethaann1806@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Attachment Sample");
	Thread.sleep(4000);


	driver.findElement(By.xpath("//div[@id=':9r']")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("Libraries\\Documents\\FileUpload.exe");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id=':fb']")).click();
	}
	@AfterClass
	public void SignOut()
	{
	driver.findElement(By.xpath("//span[@class='gb_za gbii']")).click();
	driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	//Thread.sleep(3000);
	//driver.close();
	}

}
