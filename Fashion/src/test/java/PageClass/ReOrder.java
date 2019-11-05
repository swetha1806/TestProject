package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReOrder {
	WebDriver driver;
@FindBy(xpath="/html//header[@id='header']//nav//a[@title='View my customer account']/span[.='Project demo']")
WebElement Profile;

@FindBy(linkText="ORDER HISTORY AND DETAILS")
WebElement orderHistoryDetailsBtn;

//@FindBy(xpath="/html//table[@id='order-list']//tr[@class='first_item']/td[1]/span[@class='footable-toggle']")
@FindBy(linkText="Reorder")
WebElement Details;

public void ReOrderProduct()
{
	
	Profile.click();
	orderHistoryDetailsBtn.click();
	Details.click();
	}
}
