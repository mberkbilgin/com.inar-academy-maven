package hw_AutomationExercise.tests;


import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test10 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifySubscribe() throws InterruptedException {
        BasePage.scrollDown("7500","10000");
        pages.getHomePage().setSubscribeBox("jack@sparrow.com");
        pages.getHomePage().clickSubscribeBox();
        Assert.assertTrue(pages.getHomePage().subscribeAlert.isDisplayed());


        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
