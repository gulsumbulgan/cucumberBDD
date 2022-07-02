package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;
import java.util.Map;

public class lab03Home extends BrowserUtils {
    public lab03Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[.='Add Customer'])[1]")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement addCustomerHeader;
    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> backGroundCheck;
    @FindBy(id = "fname")
    private WebElement firstName;
    @FindBy(id = "lname")
    private WebElement lastName;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(xpath = "//div[@class='12u$']//textarea")
    private WebElement address;
    @FindBy(id = "telephoneno")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement verificationHeader;

    public void setAddCustomerButton() {
        addCustomerButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(0,0).click().build().perform();
    }

    public void setAddCustomerHeader(String addcustomerHeader) {
        Assert.assertEquals(addCustomerHeader.getText(),addcustomerHeader);
    }

    public void setBackGroundCheck(String backgroundCheck) {
        for (WebElement each: backGroundCheck){
            if (each.getAttribute("id").equals(backgroundCheck)){
                JavascriptExecutor executor= (JavascriptExecutor) Driver.getDriver();
                executor.executeScript("arguments[0].click();", each);
            }else{
                System.out.println("Please check the selection you provided");
            }

        }
    }
    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void setEmail(String Email) {
        email.sendKeys(Email);
    }

    public void setAddress(String addresss) {
        address.sendKeys(addresss);
    }

    public void setMobileNumber(String mobilenumber) {
        mobileNumber.sendKeys(mobilenumber);
    }

    public void setSubmitButton() {
        submitButton.click();
    }

    public WebElement setVerificationHeader() {
        return verificationHeader;
    }
}
