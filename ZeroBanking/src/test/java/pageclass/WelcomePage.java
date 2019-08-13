package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
	WebDriver driver;
    @FindBy(id="signin_button")//locator
    public WebElement signInBtn;//creating object
    
    public void clickSignInBtn()
    {
    signInBtn.click();
    
    }
}
