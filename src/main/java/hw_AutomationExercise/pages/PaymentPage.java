package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
    @FindBy(css = "input[name='name_on_card']")
    private WebElement nameOnCard;

    @FindBy(css = "input[name='card_number']")
    private WebElement numberOnCard;

@FindBy(css = "input[placeholder='ex. 311']")
    private WebElement CVC;

@FindBy(css = "input[placeholder='MM']")
    private WebElement expirationMonth;

@FindBy(css = "input[placeholder='YYYY']")
    private WebElement expirationYear;

@FindBy(id = "submit")
    private WebElement payAndConfirmButton;

@FindBy(xpath = "(//div[class='alert-success alert'])[1]")
public  WebElement succesfullyMessage;

public void clickPayAndConfirmButton(){
    payAndConfirmButton.click();
}
public void setNameOnCard(String text){
    nameOnCard.sendKeys(text);
}
    public void setNumberOnCard(String text){
        numberOnCard.sendKeys(text);
    }

    public void setCVC(String text){
        CVC.sendKeys(text);
    }
    public void setExpirationMonth(String text){
        expirationMonth.sendKeys(text);
    }
    public void setExpirationYear(String text){
        expirationYear.sendKeys(text);
    }


}
