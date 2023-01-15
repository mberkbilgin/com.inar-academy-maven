package hw_AutomationExercise.tests;


import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test26 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void scrollDownAndUp() {
        BasePage.scrollDown("7500","10000");
        softAssert.assertTrue(pages.getHomePage().subscribeText.isDisplayed());
        BasePage.scrollDown("0","0");
        softAssert.assertTrue(pages.getHomePage().fullFledgedWebSiteMessage.isDisplayed());
        
        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
