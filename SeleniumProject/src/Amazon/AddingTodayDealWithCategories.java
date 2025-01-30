package Amazon;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmazonP.ProductPage;


public class AddingTodayDealWithCategories<HomePage, TodayDealsPage, CartPage> {

    private static final Logger logger = LoggerFactory.getLogger(AddingTodayDealWithCategories.class);

    private WebDriver driver;
    private HomePage homePage;
    private TodayDealsPage todayDealsPage;
    private ProductPage productPage;
    private CartPage cartPage;
    private String expectedResult, actualResult, productTitle;

    @BeforeTest
    public void setup() {
        WebDriverWait.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));

        homePage = new HomePage(driver);
        todayDealsPage = new TodayDealsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

        homePage.openURL(TestConfig.BASE_URL);
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testOpenTodayDeals() {
        homePage.clickTodayDealsBtn();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = "testOpenTodayDeals")
    public void testSelectCategories() {
        actualResult = todayDealsPage.getPageTitle();
        expectedResult = "Today's Deals";

        ((Object) todayDealsPage).clickHeadphonesCheckBox();
        ((Object) todayDealsPage).clickGroceryCheckBox();
        ((Object) todayDealsPage).clickDiscountBtn();

        Assert.assertEquals(actualResult, expectedResult, "Page title is wrong");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = "testSelectCategories")
    public void testSelectFourthPage() {
        todayDealsPage.clickFourthPageBtn();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            logger.error("Error in sleeping", e);
            Thread.currentThread().interrupt();
        }

        Assert.assertEquals(todayDealsPage.getSelectedPageNo(), "4", "The selected page is wrong");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = "testSelectFourthPage")
    public void testSelectProduct() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            logger.error("Error in sleeping", e);
            Thread.currentThread().interrupt();
        }
        ((Object) todayDealsPage).clickDealsProductTitle();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = "testSelectProduct")
    public void testAddItemToCart() {
        productTitle = productPage.getProductTitle();
        productPage.clickAddToCart();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = "testAddItemToCart")
    public void testCheckItemAddedToCart() {
        ((Object) cartPage).clickCartBtn();
        String cartProductTitle = ((Object) cartPage).getCartProductTitle();
        Assert.assertEquals(cartProductTitle, productTitle, "The selected item didn't add to the cart");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
