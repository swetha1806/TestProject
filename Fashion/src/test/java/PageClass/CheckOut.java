package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {
	WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement Checkout;
	@FindBy(xpath="//div[@id='center_column']//a[@title='Proceed to checkout']/span")
	WebElement CheckoutFirst;
	
	@FindBy(name="processAddress")
	WebElement ProcessAddress;
	
	@FindBy(id="cgv")
	WebElement AgreeCriteria;
	
	@FindBy(name="processCarrier")
	WebElement ProcessCarrier;
	
	@FindBy(linkText="Pay by check (order processing will be longer)")
	WebElement PaymentChecqBtn;
	
	@FindBy(xpath="//p[@id='cart_navigation']//span")
	WebElement ConfirmPayment;
	
	public void CheckOutPayment(String Status) throws InterruptedException
	{
		
		if(Status=="AddCart")
		{
		Checkout.click();
		}
		CheckoutFirst.click();
		  Thread.sleep(30);
		ProcessAddress.click();
		AgreeCriteria.click();
		  Thread.sleep(30);
		ProcessCarrier.click();
		  Thread.sleep(30);
		PaymentChecqBtn.click();
		  Thread.sleep(30);
		ConfirmPayment.click();
	}
}
