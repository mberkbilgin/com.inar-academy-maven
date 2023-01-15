package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test18 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void viewCategoryProducts()  {
        pages.getHomePage().clickWomenCategory();
        pages.getHomePage().clickDressWomenCategory();
        softAssert.assertTrue(pages.getCategoryPage1().womenDressMessage.isDisplayed());
        BasePage.navigateBackAndForwardToDismissAds();

        pages.getHomePage().clickMenCategory();
        pages.getHomePage().clickTshirtMenCategory();

        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
