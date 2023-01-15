package hw_AutomationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage{
    @FindBy(css = ".title.text-center")
    public WebElement allProductText;

    @FindBy(css = "a[href='/product_details/1']")
    public WebElement firstProduct;

    @FindBy(id = "search_product")
    private WebElement searchProductBox;

    @FindBy(id = "submit_search")
    private WebElement searchButton;

    @FindBy(css = ".title.text-center")
    public WebElement searchProductMessage;

    @FindBy(css = ".text-center p")
    public WebElement productSearched;

    @FindBy(css = ".btn-block")
    private WebElement continueShoppingButton;
    public void clickContinueShoppingButton(){
        continueShoppingButton.click();
    }

    @FindBy(css = "a[data-product-id='1']")
    private WebElement addToChartForFirstProduct;
    public void clickAddToChartForFirstProduct(){
        addToChartForFirstProduct.click();
    }

    @FindBy(css = "a[data-product-id='2']")
    private WebElement addToChartForSecondProduct;
    public void clickAddToChartForSecondProduct(){
        addToChartForSecondProduct.click();
    }

    @FindBy(css = "img[src='/get_product_picture/1']")
    public WebElement hoverOnFirstProduct;

    @FindBy(css = "img[src='/get_product_picture/2']")
    public WebElement hoverOnSecondProduct;

    @FindBy(tagName = "u")
    private WebElement viewCart;

    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    public WebElement brandColumnText;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    private WebElement poloBrand;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    private WebElement hmBrand;

    @FindBy(css = ".title.text-center")
    private WebElement brandTitleText;

    public String getBrandTitleText(){
        return brandTitleText.getText();
    }
    public void clickHmBrand(){
        hmBrand.click();
    }
    public void clickPoloBrand(){
        poloBrand.click();
    }

    public void clickViewCart(){
        viewCart.click();
    }

    public void setSearchProductBox(String text){
        searchProductBox.sendKeys(text);
    }
    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickFirstProduct(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("a[href='/product_details/4']"))).build().perform();
        firstProduct.click();
    }

}
