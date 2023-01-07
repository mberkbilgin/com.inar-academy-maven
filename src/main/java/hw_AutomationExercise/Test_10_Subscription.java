package hw_AutomationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class Test_10_Subscription {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    File file = new File("C:\\Users\\MBB\\Desktop\\SDET\\driver\\adblock.crx");


    @Test
    public void SearchProduct() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(5000,7500)");
        Assert.assertEquals(driver.findElement(By.cssSelector(".single-widget h2")).getText(), "SUBSCRIPTION");
        driver.findElement(By.id("susbscribe_email")).sendKeys("asdas@asdas.com");
        driver.findElement(By.id("subscribe")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert-success.alert")).isDisplayed());
    }

    @BeforeMethod
    public void initializeDrive() {
        WebDriverManager.chromedriver().setup();
        options.addExtensions(file);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID).close();
        driver.switchTo().window(parentID);
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");


    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


}
