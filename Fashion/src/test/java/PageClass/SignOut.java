package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut {
WebDriver driver;

@FindBy(linkText="Sign out")
WebElement SignOutBtn;

public void SignOutAccount()
{
	
	SignOutBtn.click();
	}
}
