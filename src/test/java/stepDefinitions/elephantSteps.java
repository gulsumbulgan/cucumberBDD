package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.elephantHome;
import pages.elephantPayment;
import pages.paymentVerify;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class elephantSteps extends BrowserUtils{
    public elephantSteps(){
            PageFactory.initElements(Driver.getDriver(),this);
}
    pages.elephantHome elephantHome=new elephantHome();
    pages.elephantPayment payment=new elephantPayment();
    pages.paymentVerify verify=new paymentVerify();


    @Given("The user goes to URL")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("elephantuRL"));
        BrowserUtils.staticWait(2);
    }

    @When("The user wants to verify header {string}")
    public void the_user_wants_to_verify_header(String string) {
        elephantHome.setHeader(string);



    }

    @When("The user wants to verify toy price as {string}")
    public void the_user_wants_to_verify_toy_price_as(String string) {
        elephantHome.setPrice(string);


    }
    @When("The user wants tp verify URL contains {string}")
    public void the_user_wants_tp_verify_url_contains(String string) {
        elephantHome.URL(string);


    }
    @When("The user wants to click the quantity button")
    public void the_user_wants_to_click_the_quantity_button() {
        elephantHome.clicked();
    }
    @When("The user wants to select {string}")
    public void the_user_wants_to_select(String string) {
        elephantHome.selectquantity(string);

    }
    @Then("The user wants to click Buy Now button")
    public void the_user_wants_to_click_buy_now_button() {
        elephantHome.buyNowButton();


    }

    @Then("The user wants to enter following credit card information")
    public void the_user_wants_to_enter_following_credit_card_information(Map<String,String > datatable) {
        payment.creditCard(datatable);
    }

    @Then("The user wants to click Pay button")
    public void the_user_wants_to_click_pay_button() {
        payment.setPaybutton();

    }

    @Then("The user  should be able to verify {string}")
    public void the_user_should_be_able_to_verify(String string) {
        verify.setVerify(string);
    }

    @When("The user want to buy toys according to given {int}")
    public void the_user_want_to_buy_toys_according_to_given(Integer int1) {

    }
}

