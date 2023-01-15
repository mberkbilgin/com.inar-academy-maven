package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(css = ".address_firstname.address_lastname")
    public WebElement nameAndSurname;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[3]")
    public WebElement companyName;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]/li[4]")
    public WebElement address1;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_city address_state_name address_postcode']")
    public WebElement cityStateZipCode;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_country_name']")
    public WebElement counrtyName;

    @FindBy(css = "ul[id='address_delivery'] li[class='address_phone']")
    public WebElement mobilePhone;

    @FindBy(css = ".form-control")
    private WebElement textPlace;

    public void setTextPlace(String text) {
        textPlace.sendKeys(text);
    }

        @FindBy(css = ".btn.btn-default.check_out")
    private WebElement placeOrderButton;

    public void clickPlaceOrderButton() {
        placeOrderButton.click();
    }


}
