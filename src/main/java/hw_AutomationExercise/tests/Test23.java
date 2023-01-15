package hw_AutomationExercise.tests;

import hw_AutomationExercise.pages.BasePage;
import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test23 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void verifyAddressInCheckoutPage() throws InterruptedException {
       pages.getHomePage().clickSignupLoginButton();
        String username = "jack";
        pages.getLoginPage().setSignupNewUserName(username);
        pages.getLoginPage().setSignupEmailAddressBox("jack@sparrow.com");
        pages.getLoginPage().clickSignupButton();

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

        pages.getHomePage().clickProductButton();
        BasePage.navigateBackAndForwardToDismissAds();
        BasePage.scrollDown("250", "500");
        BasePage.hover(pages.getProductPage().hoverOnFirstProduct);
        pages.getProductPage().clickAddToChartForFirstProduct();
        pages.getProductPage().clickContinueShoppingButton();
        BasePage.hover(pages.getProductPage().hoverOnSecondProduct);
        pages.getProductPage().clickAddToChartForSecondProduct();
        pages.getProductPage().clickViewCart();

        pages.getViewCartPage().clickProceedToCheckOutButton();

        softAssert.assertEquals(pages.getCheckoutPage().nameAndSurname.getText(), "Mr. Jack Sparrow");
        softAssert.assertEquals(pages.getCheckoutPage().companyName.getText(), "Caribbean");
        softAssert.assertEquals(pages.getCheckoutPage().address1.getText(), "Caribbean Street");
        softAssert.assertEquals(pages.getCheckoutPage().cityStateZipCode.getText(), "Jones Indiana 5416");
        softAssert.assertEquals(pages.getCheckoutPage().counrtyName.getText(), "India");
        softAssert.assertEquals(pages.getCheckoutPage().mobilePhone.getText(), "0849865446");

        pages.getCheckoutPage().setTextPlace("I am here");
        pages.getCheckoutPage().clickPlaceOrderButton();

        pages.getPaymentPage().setNameOnCard("Jack Sparrow");
        pages.getPaymentPage().setNumberOnCard("46544654798");
        pages.getPaymentPage().setCVC("154");
        pages.getPaymentPage().setExpirationMonth("10");
        pages.getPaymentPage().setExpirationYear("2028");
        pages.getPaymentPage().clickPayAndConfirmButton();
        //softAssert.assertTrue(pages.getPaymentPage().succesfullyMessage.isDisplayed());

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
