package hw_AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends BasePage{
    @FindBy(css = "h2[class='title text-center'] b")
    public WebElement testCaseText;
}
