package hw_AutomationExercise.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    private WebElement enterAccountMessage;

    public String getEnterAccountMessage() {
        return enterAccountMessage.getText();
    }

    @FindBy(id = "id_gender1")
    private WebElement mrCheckBox;

    public void clickMrCheckBox() {
        mrCheckBox.click();
    }

    @FindBy(id = "id_gender2")
    private WebElement msCheckBox;

    public void clickMsCheckBox() {
        msCheckBox.click();
    }

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    public void setPassword(String text) {
        password.sendKeys(text);
    }

    @FindBy(css = "#days")
    private WebElement days;

    @FindBy(css = "#months")
    private WebElement months;

    @FindBy(css = "#years")
    private WebElement years;

    @FindBy(css = "#newsletter")
    private WebElement newsletter;

    public void clickNewLetter() {
        newsletter.click();
    }

    @FindBy(css = "#optin")
    private WebElement optin;

    public void clickOptin() {
        optin.click();
    }

    @FindBy(id = "first_name")
    private WebElement firstName;

    public void setFirstName(String text) {
        firstName.sendKeys(text);
    }

    @FindBy(css = "#last_name")
    private WebElement lastName;

    public void setLastName(String text) {
        lastName.sendKeys(text);
    }

    @FindBy(id = "company")
    private WebElement company;

    public void setCompany(String text) {
        company.sendKeys(text);
    }

    @FindBy(id = "address1")
    private WebElement address1;

    public void setAddress1(String text) {
        address1.sendKeys(text);
    }

    @FindBy(id = "address2")
    private WebElement address2;

    public void setAddress2(String text) {
        address2.sendKeys(text);
    }

    @FindBy(id = "country")
    private WebElement country;

    public void setCountry(String value) {
        Select dropbox = new Select(country);
        dropbox.selectByValue(value);
    }

    @FindBy(id = "state")
    private WebElement state;

    public void setState(String text) {
        state.sendKeys(text);
    }

    @FindBy(id = "city")
    private WebElement city;

    public void setCity(String text) {
        city.sendKeys(text);
    }

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    public void setZipcode(String text) {
        zipcode.sendKeys(text);
    }

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    public void setMobileNumber(String text) {
        mobileNumber.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    private WebElement createAccountButton;
    public void clickCreateAccount(){
        createAccountButton.click();
    }

    public void setDay(String value) {
        Select dropbox = new Select(days);
        dropbox.selectByValue(value);
    }

    public void setMonth(String value) {
        Select dropbox = new Select(months);
        dropbox.selectByValue(value);
    }

    public void setYear(String value) {
        Select dropbox = new Select(years);
        dropbox.selectByValue(value);
    }


}
