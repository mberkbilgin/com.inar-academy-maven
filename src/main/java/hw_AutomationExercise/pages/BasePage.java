package hw_AutomationExercise.pages;

import hw_AutomationExercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver = Driver.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
    public static void navigateBackAndForwardToDismissAds(){
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

    }
    public static void scrollDown(String a, String b){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+a+","+b+")");
    }
    public static void hover(WebElement element){
        Actions a = new Actions(Driver.getDriver());
        a.moveToElement(element).build().perform();

    }

    public static void waitElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
