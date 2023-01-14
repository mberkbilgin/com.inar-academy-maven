package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = "div[class='signup-form'] h2")
    private WebElement newUserSignupMessage;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement signupNewUserNameBox;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement  signupEmailAddressBox;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupButton;

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(css = "div[class='login-form'] h2")
    private WebElement loginMessage;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement incorrectEmailOrPassword;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement alreadyExistMessage;




    public void setSignupNewUserName(String newUserName) {
        signupNewUserNameBox.sendKeys(newUserName);
    }
    public void setSignupEmailAddressBox(String emailAddress) {
        signupEmailAddressBox.sendKeys(emailAddress);
    }
    public void clickSignupButton(){
        signupButton.click();
    }
    public String getNewUserSignupMessage() {
        return newUserSignupMessage.getText();
    }



    public void setLoginEmailAddress(String emailAddress) {
        loginEmail.sendKeys(emailAddress);
    }

    public void setLoginEmailPassword(String password) {
        loginPassword.sendKeys(password);
    }


    public void clickLoginButton() {
        loginButton.click();
    }
    public String getLoginMessage(){
       return loginMessage.getText();
    }
    public String getIncorrectEmailOrPassword(){
        return incorrectEmailOrPassword.getText();
    }
    public String getAlreadyExistMessage(){
        return alreadyExistMessage.getText();
    }







}
