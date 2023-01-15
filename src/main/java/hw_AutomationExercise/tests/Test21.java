package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test21 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifyAllProducts() {
        pages.getHomePage().clickProductButton();

        BasePage.navigateBackAndForwardToDismissAds();
        softAssert.assertTrue(pages.getProductPage().allProductText.isDisplayed());

        pages.getProductPage().clickFirstProduct();
        softAssert.assertTrue(pages.getProductDetailsPage().productDetailsColumn.isDisplayed());

        pages.getProductDetailsPage().setNameForReview("Jack Sparrow");
        pages.getProductDetailsPage().setEmailForReview("jack@sparrow.com");
        pages.getProductDetailsPage().setReview("This product is perfect");
        BasePage.scrollDown("250","500");
        pages.getProductDetailsPage().clickSubmitButtonForReview();

        softAssert.assertTrue(pages.getProductDetailsPage().successReviewMessage.isDisplayed());


        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
