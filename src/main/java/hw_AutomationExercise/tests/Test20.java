package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test20 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void searchProductAndVerifyAfterLogin() {
        pages.getHomePage().clickProductButton();

        BasePage.navigateBackAndForwardToDismissAds();
        softAssert.assertTrue(pages.getProductPage().allProductText.isDisplayed());

        pages.getProductPage().setSearchProductBox("Blue Top");
        pages.getProductPage().clickSearchButton();
        softAssert.assertTrue(pages.getProductPage().searchProductMessage.isDisplayed());
        if (pages.getProductPage().productSearched.getText().contains("Blue Top")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        BasePage.scrollDown("250","500");
        BasePage.hover(pages.getProductPage().hoverOnFirstProduct);
        pages.getProductPage().clickAddToChartForFirstProduct();
        pages.getProductPage().clickViewCart();
        softAssert.assertEquals(pages.getViewCartPage().getDetailsOfFirstProduct(),"Blue Top");
        softAssert.assertEquals(pages.getViewCartPage().getPriceOfFirstProduct(),"Rs. 500");
        softAssert.assertEquals(pages.getViewCartPage().getQuantityOfFirstProduct(),"1");

        pages.getHomePage().clickSignupLoginButton();

        softAssert.assertEquals(pages.getLoginPage().getLoginMessage(),"Login to your account");
        pages.getLoginPage().setLoginEmailAddress("jack@sparrow.com");
        pages.getLoginPage().setLoginEmailPassword("123456");
        pages.getLoginPage().clickLoginButton();

        pages.getHomePage().clickCartButton();
        softAssert.assertEquals(pages.getViewCartPage().getDetailsOfFirstProduct(),"Blue Top");
        softAssert.assertEquals(pages.getViewCartPage().getPriceOfFirstProduct(),"Rs. 500");
        softAssert.assertEquals(pages.getViewCartPage().getQuantityOfFirstProduct(),"1");


        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
