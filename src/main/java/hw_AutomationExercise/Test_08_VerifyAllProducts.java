package hw_AutomationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Test_08_VerifyAllProducts {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    File file = new File("C:\\Users\\MBB\\Desktop\\SDET\\driver\\adblock.crx");


    @Test
    public void Products() {
        driver.findElement(By.cssSelector("a[href='/products']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/products");
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
        //The product name
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='product-information'] h2")).isDisplayed());

        // details of the product
        List<WebElement> details = driver.findElements(By.xpath("//div/p"));
        for (int i = 2; i <= 5; i++) {
            //The number of element is 7. But there are elements which we don't need.
            // Due to that, I determined borders  like as between 2 and 5
            String[] actualDetails = details.get(i).getText().split(":");
            if (actualDetails[0].contains("Category")) {
                Assert.assertTrue(true);
            } else if (actualDetails[0].contains("Availability")) {
                Assert.assertTrue(true);
            } else if (actualDetails[0].contains("Condition")) {
                Assert.assertTrue(true);
            } else if (actualDetails[0].contains("Brand")) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        }
        //price of the product
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='product-information'] span span")).isDisplayed());
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
