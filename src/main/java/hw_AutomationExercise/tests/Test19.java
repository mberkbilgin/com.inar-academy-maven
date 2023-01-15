package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test19 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void brandNames() {
        pages.getHomePage().clickProductButton();


        softAssert.assertTrue(pages.getProductPage().brandColumnText.isDisplayed());
        BasePage.navigateBackAndForwardToDismissAds();
        BasePage.scrollDown("250","500");
        pages.getProductPage().clickPoloBrand();
        softAssert.assertEquals(pages.getProductPage().getBrandTitleText(),"BRAND - POLO PRODUCTS");
        pages.getProductPage().clickHmBrand();
        softAssert.assertEquals(pages.getProductPage().getBrandTitleText(),"BRAND - H&M PRODUCTS");

        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
