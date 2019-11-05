package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishList {
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
	
	@FindBy(linkText="Add to Wishlist")
	WebElement WishList;
	
	@FindBy(className="fancybox-item fancybox-close")
	WebElement CloseWishList;
	@FindBy(id="category")
	WebElement Home;
	public void WishListAddCart() throws InterruptedException
	{
		
		women.click();
		Thread.sleep(20);
		dresses.click();
		CasualDress.click();
		Thread.sleep(20);
		Size.click();
		Thread.sleep(20);
		list.click();
		WishList.click();
	Home.click();
	}
}
