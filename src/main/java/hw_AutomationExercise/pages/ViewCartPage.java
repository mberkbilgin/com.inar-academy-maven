package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCartPage extends BasePage{
    @FindBy(css = "a[href='/product_details/1']")
    private WebElement detailsOfFirstProduct;

    @FindBy(css = "a[href='/product_details/2']")
    private WebElement detailsOfSecondProduct;

    public String getDetailsOfFirstProduct(){
        return detailsOfFirstProduct.getText();
    }
    public String getDetailsOfSecondProduct(){
        return detailsOfSecondProduct.getText();
    }
    @FindBy(css = "tr[id='product-1'] td[class='cart_price'] p")
    private WebElement priceOfFirstProduct;

    @FindBy(css = "tr[id='product-2'] td[class='cart_price'] p")
    private WebElement priceOfSecondProduct;

    public String getPriceOfFirstProduct(){
        return priceOfFirstProduct.getText();
    }
    public String getPriceOfSecondProduct(){
        return priceOfSecondProduct.getText();
    }
    @FindBy(css = "tr[id='product-1'] button[class='disabled']")
    private WebElement quantityOfFirstProduct;

    @FindBy(css = "tr[id='product-2'] button[class='disabled']")
    private WebElement quantityOfSecondProduct;

    public String getQuantityOfFirstProduct(){
        return quantityOfFirstProduct.getText();
    }
    public String getQuantityOfSecondProduct(){
        return quantityOfSecondProduct.getText();
    }


}
