package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends BasePage{
    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement downloadInvoice;

    @FindBy(css = ".btn.btn-primary")
    private WebElement continueButton;

    public void clickContinueButton(){
        continueButton.click();
    }

    public void clickDownloadInvoice(){
        downloadInvoice.click();
    }
}
