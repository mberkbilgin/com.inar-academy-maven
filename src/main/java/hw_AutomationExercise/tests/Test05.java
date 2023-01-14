package hw_AutomationExercise.tests;

import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test05 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }
    @Test
    public void signUp()  {
        pages.getHomePage().clickSignupLoginButton();

        softAssert.assertEquals(pages.getLoginPage().getNewUserSignupMessage(),"New User Signup!");
        String username = "jack";
        pages.getLoginPage().setSignupNewUserName(username);
        pages.getLoginPage().setSignupEmailAddressBox("jack@sparrow.com");
        pages.getLoginPage().clickSignupButton();

        softAssert.assertTrue(pages.getLoginPage().alreadyExistMessage.isDisplayed());


        softAssert.assertAll();


    }
    @AfterMethod
    public void tearDown(){
        Driver.getDriver().quit();
    }
}
