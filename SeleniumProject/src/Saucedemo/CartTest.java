package Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.util.concurrent.TimeUnit;

public class CartTest {
    WebDriver driver;
	private Object QaEnvPropReader;

    @BeforeMethod
    public void setUp() {
    	 WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = QaEnvPropReader.getProperty("url");
        driver.get(url);
    }

    @Test
    public void TC7_VerifyAddProductInCart() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        SoftAssert sa = new SoftAssert();

        // Test steps here...
    }

    @Test
    public void TC8_VerifyRemoveProductsFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        SoftAssert sa = new SoftAssert();

        // Test steps here...
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
