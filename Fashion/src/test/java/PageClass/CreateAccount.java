package PageClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
WebDriver driver;

@FindBy(linkText="Sign in")
WebElement SignInBtn;

@FindBy(id="email_create")
WebElement EmailId;

@FindBy(id="SubmitCreate")
WebElement SubmitBtn;

@FindBy(id="id_gender2")
WebElement Gender;

@FindBy(id="customer_firstname")
WebElement FirstNameText;

@FindBy(id="customer_lastname")
WebElement LastNameText;

@FindBy(id="passwd")
WebElement PasswordText;

@FindBy(id="days")
WebElement days;

@FindBy(id="months")
WebElement month;

@FindBy(id="years")
WebElement year;

@FindBy(id="firstname")
WebElement FirstNameAddress;

@FindBy(id="lastname")
WebElement LastNameAddress;

@FindBy(id="address1")
WebElement Address;

@FindBy(id="city")
WebElement City;

@FindBy(id="id_state")
WebElement State;//1

@FindBy(id="postcode")
WebElement PostalCode;

@FindBy(id="id_country")
WebElement Country;

@FindBy(id="phone_mobile")
WebElement Mobile;

@FindBy(id="alias")
WebElement Alias;

@FindBy(id="submitAccount")
WebElement submitAccountBtn;

public void CreateNewAccount()
{
	
SignInBtn.click();
EmailId.sendKeys("demomailswetha@gmail.com");
SubmitBtn.click();
Gender.click();
FirstNameText.sendKeys("Project");
LastNameText.sendKeys("demo");
PasswordText.sendKeys("demoFacebookEmail123*");
Select sDay=new Select(days);
sDay.selectByValue("2");
Select sMonth=new Select(month);
sMonth.selectByValue("6");
Select sYear=new Select(year);
sYear.selectByValue("1993");
FirstNameAddress.sendKeys("Project");
LastNameAddress.sendKeys("demo");
Address.sendKeys("23 Rose Cres");
City.sendKeys("KingSton");
Select sState=new Select(State);
sState.selectByValue("2");
PostalCode.sendKeys("12345");
Select sCountry=new Select(Country);
sCountry.selectByValue("21");
Mobile.sendKeys("9947946249");
Alias.sendKeys("23 Rose Cres");
submitAccountBtn.click();
	}

}
