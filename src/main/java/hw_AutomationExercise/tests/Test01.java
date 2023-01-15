package hw_AutomationExercise.tests;


import hw_AutomationExercise.utilities.Driver;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Test01 extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void signUp() {
        pages.getHomePage().clickSignupLoginButton();

        softAssert.assertEquals(pages.getLoginPage().getNewUserSignupMessage(), "New User Signup!");
        String username = "jack";
        pages.getLoginPage().setSignupNewUserName(username);
        pages.getLoginPage().setSignupEmailAddressBox("jack@sparrow.com");
        pages.getLoginPage().clickSignupButton();

        softAssert.assertEquals(pages.getSignupPage().getEnterAccountMessage(), "ENTER ACCOUNT INFORMATION");
        pages.getSignupPage().clickMrCheckBox();
        pages.getSignupPage().setPassword("123456");
        pages.getSignupPage().setDay("15");
        pages.getSignupPage().setMonth("8");
        pages.getSignupPage().setYear("1975");
        pages.getSignupPage().clickNewLetter();
        pages.getSignupPage().clickOptin();
        pages.getSignupPage().setFirstName("Jack");
        pages.getSignupPage().setLastName("Sparrow");
        pages.getSignupPage().setCompany("Caribbean");
        pages.getSignupPage().setAddress1("Caribbean Street");
        pages.getSignupPage().setCountry("India");
        pages.getSignupPage().setState("Indiana");
        pages.getSignupPage().setCity("Jones");
        pages.getSignupPage().setZipcode("5416");
        pages.getSignupPage().setMobileNumber("0849865446");
        pages.getSignupPage().clickCreateAccount();

        softAssert.assertEquals(pages.getAccountCreatedPage().getAccounCreatedMessage(), "ACCOUNT CREATED!");
        pages.getAccountCreatedPage().clickContinueButton();

        softAssert.assertEquals(pages.getHomePage().getLoggedInAs(), "Logged in as " + username);
        pages.getHomePage().clickDeleteAccount();

        softAssert.assertEquals(pages.getDeleteAccountPage().getAccountDeletedMessage(), "ACCOUNT DELETED!");
        pages.getDeleteAccountPage().clickContinueButton();

        softAssert.assertAll();


    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
