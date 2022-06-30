package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

public class Home extends BrowserUtils {
    public Home() {
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//a[@href='addtariffplans.php'][1]")
        private WebElement addTariff;
        public void setAddTariff(){
        staticWait(2);
        addTariff.click();}


    @FindBy(xpath = "//a[@href='addtariffplans.php'][1]")
    private WebElement verification;


    @FindBy(xpath = "//input[@name='rental']")
    private WebElement monthlyRental;

    @FindBy(xpath = "//input[@name='local_minutes']")
    private WebElement freeLocal;


    @FindBy(xpath = "//input[@name='inter_minutes']")
    private WebElement freeInternational;

    @FindBy(xpath = "//input[@name='sms_pack']")
    private WebElement freeSms;


    @FindBy(xpath = "//input[@name='minutes_charges']")
    private WebElement localMinutes;


    @FindBy(xpath = "//input[@name='inter_charges']")
    private WebElement interMinutes;


    @FindBy(xpath = "//input[@name='sms_charges']")
    private WebElement smsCharges;


    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit;


    @FindBy(xpath ="//h2[.='Congratulation you add Tariff Plan']" )
    private WebElement verifymsg;

    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement verifyheader;

    public void setVerification(String expectedMessage){

        Assert.assertEquals(verification.getText(),expectedMessage);
    }
    public void setMonthlyRental(){monthlyRental.sendKeys(ConfigurationsReader.getProperties("monthlyRental"));}
    public void setFreeLocal(){freeLocal.sendKeys(ConfigurationsReader.getProperties("freeLocal"));}
    public void setFreeInternational(){freeInternational.sendKeys(ConfigurationsReader.getProperties("freeInternational"));}
    public void setFreeSms(){freeSms.sendKeys(ConfigurationsReader.getProperties("freeSms"));}
    public void setLocalMinutes(){
        localMinutes.sendKeys(ConfigurationsReader.getProperties("localMinutes"));
    }
    public void setInterMinutes(){interMinutes.sendKeys(ConfigurationsReader.getProperties("interMinutes"));}
    public void setSmsCharges(){smsCharges.sendKeys(ConfigurationsReader.getProperties("smsCharges"));}
    public void setSubmit(){submit.click();}
    public void setVerifymsg(String expectedmsg){
        staticWait(2);
        Assert.assertEquals(expectedmsg,verifymsg.getText());
    }
    public void setVerifyheader(String expectedheader){
        staticWait(5);
        Assert.assertEquals(expectedheader,verifyheader.getText());

    }















    }
