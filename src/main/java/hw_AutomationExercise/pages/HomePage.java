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
