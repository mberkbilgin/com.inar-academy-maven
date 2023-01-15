package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {
    @FindBy(css = ".product-information")
    public WebElement productDetailsColumn;

    @FindBy(id = "quantity")
    private WebElement quantityOfProduct;

    @FindBy(css = "button[type='button']")
    private WebElement addToCart;

    @FindBy(tagName = "u")
    private WebElement viewCart;
    @FindBy(css = "#name")
    private WebElement nameForReview;
    @FindBy(css = "#email")
    private WebElement emailForReview;
    @FindBy(css = "#review")
    private WebElement review;
    @FindBy(css = "#button-review")
    private WebElement submitButtonForReview;

    @FindBy(css = "div[class='alert-success alert'] span")
    public WebElement successReviewMessage;

    public void setNameForReview(String text){
        nameForReview.sendKeys(text);
    }
    public void setEmailForReview(String text){
        emailForReview.sendKeys(text);
    }
    public void setReview(String text){
        review.sendKeys(text);
    }
    public void clickSubmitButtonForReview(){
        submitButtonForReview.click();
    }


    public void setQuantityOfProduct(String quantity) {
        quantityOfProduct.clear();
        quantityOfProduct.sendKeys(quantity);
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickViewCart() {
        viewCart.click();
    }
}
