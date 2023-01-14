package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test13 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifyAllProducts() throws InterruptedException {
        pages.getHomePage().clickProductButton();
        BasePage.navigateBackAndForwardToDismissAds();

        pages.getProductPage().clickFirstProduct();
        pages.getProductDetailsPage().setQuantityOfProduct("4");
        pages.getProductDetailsPage().clickAddToCart();
        pages.getProductDetailsPage().clickViewCart();
        softAssert.assertEquals(pages.getViewCartPage().getDetailsOfFirstProduct(),"Blue Top");
        softAssert.assertEquals(pages.getViewCartPage().getPriceOfFirstProduct(),"Rs. 500");
        softAssert.assertEquals(pages.getViewCartPage().getQuantityOfFirstProduct(),"4");


        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }

}
