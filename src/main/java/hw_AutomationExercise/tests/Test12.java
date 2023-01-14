package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test12 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifyProductsDetails() {
        pages.getHomePage().clickProductButton();
        BasePage.navigateBackAndForwardToDismissAds();
        BasePage.scrollDown("250","500");
        BasePage.hover(pages.getProductPage().hoverOnFirstProduct);
        pages.getProductPage().clickAddToChartForFirstProduct();
        pages.getProductPage().clickContinueShoppingButton();
        BasePage.hover(pages.getProductPage().hoverOnSecondProduct);
        pages.getProductPage().clickAddToChartForSecondProduct();
        pages.getProductPage().clickViewCart();
        softAssert.assertEquals(pages.getViewCartPage().getDetailsOfFirstProduct(),"Blue Top");
        softAssert.assertEquals(pages.getViewCartPage().getDetailsOfSecondProduct(),"Men Tshirt");
        softAssert.assertEquals(pages.getViewCartPage().getPriceOfFirstProduct(),"Rs. 500");
        softAssert.assertEquals(pages.getViewCartPage().getPriceOfSecondProduct(),"Rs. 400");
        softAssert.assertEquals(pages.getViewCartPage().getQuantityOfFirstProduct(),"1");
        softAssert.assertEquals(pages.getViewCartPage().getQuantityOfSecondProduct(),"1");


        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
