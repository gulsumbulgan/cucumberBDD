package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class elephantHome extends BrowserUtils {
    public elephantHome() {
       PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(tagName = "h2")
    private WebElement header;
    public void setHeader(String expectedheader) {
        Assert.assertEquals(header.getText(), expectedheader);}
    @FindBy(tagName = "h3")
    private WebElement price;
    public void setPrice(String expected) {
        String x = price.getText();
        String id = x.split(": ")[1].trim();
        Assert.assertEquals(id,expected);}
    public boolean URL(String urlcontains) {
        String Url = Driver.getDriver().getCurrentUrl();
        if (Url.contains(urlcontains)) {
            return true;
        } else {
            return false;
        }}
    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantity;
    public void clicked() {
        quantity.click();}
    public void  selectquantity(String src){
    Select dropdown=new Select(quantity);
    dropdown.selectByValue(src);
   }
   @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;
    public void buyNowButton(){
        buyNow.click();
    }

}
