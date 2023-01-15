package hw_AutomationExercise.pages;

import hw_AutomationExercise.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class HomePage extends BasePage {
    @FindBy(css = "a[href='/login']")
    private WebElement signupLoginButton;

    @FindBy(xpath = "//li[10]//a[1]")
    private WebElement loggedInAs;

    @FindBy(css = "a[href='/delete_account']")
    private WebElement deleteAccountButton;

    @FindBy(css = "a[href='/logout']")
    private WebElement logout;

    @FindBy(css = "a[href='/contact_us']")
    private WebElement contactUsButton;

    @FindBy(css = "a[href='/test_cases']")
    private WebElement testCaseButton;

    @FindBy(css = "a[href='/products']")
    private WebElement productButton;

    @FindBy(id = "susbscribe_email")
    private WebElement subscribeBox;

    @FindBy(id = "subscribe")
    private WebElement subscribeButton;

    @FindBy(css = ".alert-success.alert")
    public WebElement subscribeAlert;

    @FindBy(css = "a[href='/view_cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//a[normalize-space()='Women']")
    private WebElement womenCategory;

    @FindBy(css = "a[href='/category_products/1']")
    private WebElement dressWomenCategory;

    @FindBy(xpath = "//a[normalize-space()='Men']")
    private WebElement menCategory;
    @FindBy(css = "a[href='/category_products/3']")
    private WebElement tshirtMenCategory;
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    public WebElement recommendedItemsText;

    @FindBy(xpath = "//div[@class='item active']//div[1]//div[1]//div[1]//div[1]//a[1]")
    public WebElement oneOfTheRecommendedProducts;
    @FindBy(css = "div[class='item active'] div[class='col-sm-6'] h2")
    public WebElement fullFledgedWebSiteMessage;
    @FindBy(css = "div[class='single-widget'] h2")
    public WebElement subscribeText;

    public void clickOneOfTheRecommendedProducts(){
        oneOfTheRecommendedProducts.click();
    }

    public void clickWomenCategory(){
        womenCategory.click();
    }
    public void clickMenCategory(){
        menCategory.click();
    }
    public void clickDressWomenCategory(){
        dressWomenCategory.click();
    }
    public void clickTshirtMenCategory(){
        tshirtMenCategory.click();
    }

    public void clickCartButton(){
        cartButton.click();
    }


    public void clickSubscribeBox() {
        subscribeButton.click();
    }

    public void setSubscribeBox(String text) {

        subscribeBox.sendKeys(text);
    }

    public void clickProductButton() {
        productButton.click();
    }


    public void clickSignupLoginButton() {
        signupLoginButton.click();
    }

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }

    public String getLoggedInAs() {
        return loggedInAs.getText();
    }

    public void clickLogout() {
        logout.click();
    }

    public void clickContactUs() {
        contactUsButton.click();
    }

    public void clickTestCase() {
        testCaseButton.click();
    }
}
