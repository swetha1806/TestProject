package Selenium;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class GmailSample {
	private static WebDriver driver;
	private static String Url;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Url = "https://www.gmail.com/";
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_75\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);


		driver.findElement(By.id("identifierId")).sendKeys("hiteship020",Keys.ENTER);
		     Thread.sleep(3000);
		     driver.findElement(By.name("password")).sendKeys("Demo_1234",Keys.ENTER);
		     Thread.sleep(4000);
		     
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     driver.close();
	}

}
