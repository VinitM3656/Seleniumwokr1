package Amazon;




import static org.testng.Assert.assertEquals;

import java.awt.print.Book;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Created by tmaher on 12/14/2015.
 * @param <ShoppingCartReviewPage>
 */
public class PurchesOrder<ShoppingCartReviewPage> {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = DriverUtils.getDriver();

    }

//    @Test()
//    public void test_Login(){
//        OrderActions orderActions = new OrderActions();
//        String username = LoadProperties.user.getProperty("tester23.username");
//        String password = LoadProperties.user.getProperty("tester23.password");
//        orderActions.navigateToHomePage();
//        orderActions.loginAs(username, password);
//        orderActions.initializeLogin();
//    }

    @Test()
    public void test_createPurchaseOrderForSingleProduct(){
        Products testBook = Products.HITCHHIKERS_GUIDE;
        String username = LoadProperties.user.getProperty("tester23.username");
        String password = LoadProperties.user.getProperty("tester23.password");
        OrderActions orderActions = new OrderActions();
        ShoppingCartReviewPage shoppingCartReviewPage = new ShoppingCartReviewPage();

        orderActions.initializeLogin();
        orderActions.navigateToHomePage();
        orderActions.loginAs(username, password);
        orderActions.initializeCart();

        Book bookProductPage = orderActions.loadProductPageDataIntoProductObject(testBook);
        orderActions.addProductToShoppingCartReview(testBook);
        String actualCartSubtotalPrice = shoppingCartReviewPage.getCartSubtotal();
        String expectedBookPrice =  ((Object) bookProductPage).getOfferPrice();
        orderActions.checkMatchingValues("Verify the Price Listed for the book:", actualCartSubtotalPrice, expectedBookPrice);
        assertEquals(actualCartSubtotalPrice, expectedBookPrice, "SHOPPING_CART_REVIEW: Cart Subtotal not what is expected!");
        //Book bookShoppingCart = orderActions.loadShoppingCartDataIntoProductObject(testBook);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
