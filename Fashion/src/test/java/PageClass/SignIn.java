package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {
	WebDriver driver;
	@FindBy(linkText="Sign in")
	WebElement SignInBtn;
	
	@FindBy(id="email")
	WebElement EmailSignIn;

	@FindBy(id="passwd")
	WebElement Password;

	@FindBy(id="SubmitLogin")
	WebElement SubmitBtn;
	
	public void SignInAccount()
	{
		
		SignInBtn.click();
		EmailSignIn.sendKeys("demoFacebookEmail@gmail.com");
		Password.sendKeys("demoFacebookEmail123*");
		SubmitBtn.click();
	}
	public void SigInData(String username,String password)
	{
		
		SignInBtn.click();
		EmailSignIn.sendKeys(username);
		Password.sendKeys(password);
		SubmitBtn.click();
	}
}
