package hw_AutomationExercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class Test_12_AddProductsInCart {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    File file = new File("C:\\Users\\MBB\\Desktop\\SDET\\driver\\adblock.crx");


    @Test
    public void SearchProduct() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("a[href='/products']")).click();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("img[src='/get_product_picture/1']"))).build().perform();
        driver.findElement(By.cssSelector("a[data-product-id='1']")).click();
        driver.findElement(By.cssSelector(".btn-block")).click();
        a.moveToElement(driver.findElement(By.cssSelector("img[src='/get_product_picture/2']"))).build().perform();
        driver.findElement(By.cssSelector("a[data-product-id='2']")).click();
        driver.findElement(By.tagName("u")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("a[href='/product_details/1']")).getText(),"Blue Top");
        Assert.assertEquals(driver.findElement(By.cssSelector("a[href='/product_details/2']")).getText(),"Men Tshirt");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-1'] td[class='cart_price'] p")).getText(),"Rs. 500");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-2'] td[class='cart_price'] p")).getText(),"Rs. 400");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-1'] button[class='disabled']")).getText(),"1");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-2'] button[class='disabled']")).getText(),"1");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-1'] p[class='cart_total_price']")).getText(),"Rs. 500");
        Assert.assertEquals(driver.findElement(By.cssSelector("tr[id='product-2'] p[class='cart_total_price']")).getText(),"Rs. 400");






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

   /* @AfterMethod
    public void tearDown() {
        driver.close();
    }*/


}
