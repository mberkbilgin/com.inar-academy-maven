package hw_AutomationExercise.tests;

import hw_AutomationExercise.utilities.Driver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test06 extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void signUp()  {
        pages.getHomePage().clickContactUs();

        softAssert.assertTrue(pages.getContactUsPage().contactUsMessage.isDisplayed());
        pages.getContactUsPage().setName("jack");
        pages.getContactUsPage().setEmail("jack@sparrow.com");
        pages.getContactUsPage().setSubject("about tshirt");
        pages.getContactUsPage().setMessage("This t-shirt is defective");
        pages.getContactUsPage().clickSubmitButton();
        pages.getContactUsPage().okeyPopup();
        softAssert.assertTrue(pages.getContactUsPage().successMessage.isDisplayed());
        pages.getContactUsPage().clickHomeButton();

        softAssert.assertAll();


    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
