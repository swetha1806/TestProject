package Selenium;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_75\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("swethaann1806",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Sas180693*",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id=':pt']")).sendKeys("swethaann1806@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=':pb']")).sendKeys("Attachment Sample");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id=':qg']")).sendKeys("Body Sample");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=':qt']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\FileUpload.exe");
		driver.findElement(By.xpath("//div[@id=':mt']/div[@class='dC']/div[1]")).click();


		//driver.close();

	}

}
