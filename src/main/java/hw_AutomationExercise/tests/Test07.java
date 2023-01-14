package hw_AutomationExercise.tests;

import hw_AutomationExercise.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test07 extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void initiliaze() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void signUp() {
        pages.getHomePage().clickTestCase();
        softAssert.assertEquals(pages.getTestCasePage().testCaseText.getText(),"TEST CASES");

        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
