package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage{
    @FindBy(css = "h2[class='title text-center'] b")
    WebElement accountDeletedMessage;

    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton;

    public String getAccountDeletedMessage(){
        return accountDeletedMessage.getText();
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}
