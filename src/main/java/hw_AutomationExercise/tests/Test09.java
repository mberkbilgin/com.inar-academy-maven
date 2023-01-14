package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test09 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void searchProduct() throws InterruptedException {
        pages.getHomePage().clickProductButton();

        BasePage.navigateBackAndForwardToDismissAds();
        softAssert.assertTrue(pages.getProductPage().allProductText.isDisplayed());

        pages.getProductPage().setSearchProductBox("winter");
        pages.getProductPage().clickSearchButton();
        softAssert.assertTrue(pages.getProductPage().searchProductMessage.isDisplayed());
        if (pages.getProductPage().productSearched.getText().contains("Winter")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
