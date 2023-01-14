package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {
    @FindBy(css = "h2[class='title text-center'] b")
    WebElement accounCreatedMessage;

    public String getAccounCreatedMessage() {
        return accounCreatedMessage.getText();
    }

    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton;

    public void clickContinueButton() {
        continueButton.click();
    }


}
