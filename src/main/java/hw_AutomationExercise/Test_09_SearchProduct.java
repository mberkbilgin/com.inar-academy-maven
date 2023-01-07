package hw_AutomationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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


public class Test_09_SearchProduct {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    File file = new File("C:\\Users\\MBB\\Desktop\\SDET\\driver\\adblock.crx");



    @Test
    public void SearchProduct() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("a[href='/products']")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/products");

        driver.findElement(By.id("search_product")).sendKeys("Winter");
        driver.findElement(By.id("submit_search")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector(".title.text-center")).getText(),"SEARCHED PRODUCTS");
        if (driver.findElement(By.cssSelector(".text-center p")).getText().contains("Winter")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
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