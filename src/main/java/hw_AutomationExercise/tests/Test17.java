package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test17 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void removeProduct() throws InterruptedException {
        pages.getHomePage().clickProductButton();
        BasePage.navigateBackAndForwardToDismissAds();
        BasePage.scrollDown("250", "500");
        BasePage.hover(pages.getProductPage().hoverOnFirstProduct);
        pages.getProductPage().clickAddToChartForFirstProduct();
        pages.getProductPage().clickViewCart();

        pages.getViewCartPage().clickDeleteProduct();
        Thread.sleep(2000);
        softAssert.assertTrue(pages.getViewCartPage().emptyCartMessage.isDisplayed());

        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
