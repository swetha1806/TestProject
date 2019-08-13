package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_75\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.findElement(By.name("userName")).sendKeys("tutorial");
		 driver.findElement(By.name("password")).sendKeys("tutorial");
		 driver.findElement(By.name("login")).click();
		 driver.findElement(By.xpath("//input[@value='oneway']")).click();
		 Select flightID=new Select(driver.findElement(By.name("airline")));
		 flightID.selectByVisibleText("Pangea Airlines");
		List<WebElement> flightName=flightID.getOptions();
		System.out.print(flightName.size());
		 driver.findElement(By.name("findFlights")).click();

	}

}
