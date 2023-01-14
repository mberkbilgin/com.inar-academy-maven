package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    @FindBy(css = ".product-information")
    public WebElement productDetailsColumn;

    @FindBy(id = "quantity")
    private WebElement quantityOfProduct;

    @FindBy(css = "button[type='button']")
    private WebElement addToCart;

    @FindBy(tagName = "u")
    private WebElement viewCart;

    public void setQuantityOfProduct(String quantity){
        quantityOfProduct.clear();
        quantityOfProduct.sendKeys(quantity);
    }

    public void clickAddToCart(){
        addToCart.click();
    }
    public void clickViewCart(){
        viewCart.click();
    }
}
