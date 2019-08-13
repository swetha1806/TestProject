package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage {

WebDriver driver;



@FindBy(linkText="Add New Payee")
public WebElement AddNewPayeeBtn;

@FindBy(id="np_new_payee_name")
public WebElement NewPayeeNametxt;

@FindBy(id="np_new_payee_address")
public WebElement NewPayeeAddresstxt;

@FindBy(id="np_new_payee_account")
public WebElement NewPayeeAccounttxt;

@FindBy(id="np_new_payee_details")
public WebElement NewPayeeDetails;

@FindBy(id="add_new_payee")
public WebElement AddNewPaye;

public void ClickAddNewPayee()
{
AddNewPayeeBtn.click();
}

public void AddPayee(String name,String address,String Account,String PayeeDetails)
{
NewPayeeNametxt.sendKeys(name);
NewPayeeAddresstxt.sendKeys(address);
NewPayeeAccounttxt.sendKeys(Account);
NewPayeeDetails.sendKeys(PayeeDetails);
AddNewPaye.click();
}
}
