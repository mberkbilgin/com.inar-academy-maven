package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement contactUsMessage;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement name;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement email;

    @FindBy(css = "input[placeholder='Subject']")
    private WebElement subject;

    @FindBy(id = "message")
    private WebElement message;

    @FindBy(css = "input[value='Submit']")
    private WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy(css = "a[class='btn btn-success'] span")
    private WebElement homeButton;

    public void setName(String text) {
        name.sendKeys(text);
    }

    public void setEmail(String text) {
        email.sendKeys(text);
    }

    public void setSubject(String text) {
        subject.sendKeys(text);
    }

    public void setMessage(String text) {
        message.sendKeys(text);
    }
    public void clickSubmitButton() {
        submit.click();
    }
    public void okeyPopup(){
        driver.switchTo().alert().accept();
    }
    public void clickHomeButton(){
        homeButton.click();
    }
}
