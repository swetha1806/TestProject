package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCart {

	WebDriver driver;
	@FindBy(linkText="WOMEN")
	WebElement women;

	@FindBy(linkText="Dresses")
	WebElement dresses;

	@FindBy(linkText="Casual Dresses")
	WebElement CasualDress;

	@FindBy(id="layered_id_attribute_group_2")
	WebElement Size;
	@FindBy(id="list")
	WebElement list;
	@FindBy(xpath="/html//div[@id='center_column']/ul/li//a[@title='Add to cart']/span[.='Add to cart']")
	WebElement AddToCart;

	
	public void AddCartTop() throws InterruptedException
	{


		women.click();
		Thread.sleep(20);
		dresses.click();
		CasualDress.click();
		Thread.sleep(20);
		Size.click();
		Thread.sleep(20);
		list.click();
		AddToCart.click();
	    Thread.sleep(30);
		
	}
}
