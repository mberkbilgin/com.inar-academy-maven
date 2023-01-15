package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test22 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifyAllProducts() {
        BasePage.scrollDown("6000","7500");
        softAssert.assertTrue(pages.getHomePage().recommendedItemsText.isDisplayed());
        BasePage.waitElement(pages.getHomePage().oneOfTheRecommendedProducts);
        pages.getHomePage().clickOneOfTheRecommendedProducts();
        pages.getProductPage().clickViewCart();

        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
