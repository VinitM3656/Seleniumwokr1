package Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class FailedLoginTest<HomePage> {
    private WebDriver driver;
    private LogoutPage loginPage;
    private HomePage homePage;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinit\\Documents\\Selenium\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/v1/");
        loginPage = new LogoutPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void failedLoginWithWrongPassword() {
        ((Object) loginPage).enterUsername("standard_user");
        loginPage.enterPassword("Stander_@2133"); s
        loginPage.clickLoginButton();

       

        Assert.assertTrue(wait.until(ExpectedConditions.urlContains("error")), "Error message not displayed");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
