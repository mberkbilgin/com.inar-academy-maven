package hw_AutomationExercise.tests;

import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test04 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void login() {
        pages.getHomePage().clickSignupLoginButton();

        softAssert.assertEquals(pages.getLoginPage().getLoginMessage(), "Login to your account");
        pages.getLoginPage().setLoginEmailAddress("jack@sparrow.com");
        pages.getLoginPage().setLoginEmailPassword("123456");
        pages.getLoginPage().clickLoginButton();

        softAssert.assertEquals(pages.getHomePage().getLoggedInAs(),"Logged in as jack");
        pages.getHomePage().clickLogout();

        softAssert.assertAll();


    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
