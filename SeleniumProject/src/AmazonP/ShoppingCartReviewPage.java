package AmazonP;



import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestException;


public class ShoppingCartReviewPage extends CommonUtils {

    private final By CART_BUTTON = By.cssSelector("#hlb-view-cart-announce");
    private final By PROCEED_TO_CHECKOUT_BUTTON = By.cssSelector("#hlb-ptc-btn-native");
    private final By PRICE = By.cssSelector("[class='a-color-price hlb-price a-inline-block a-text-bold']");

    // Use SLF4J logger
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartReviewPage.class);

    public void verifyOnShoppingCartReviewPage(){
        String url = getCurrentURL();
        logger.info("Verifying that we are on SHOPPING_CART_REVIEW_PAGE.");
        if (!url.contains("view")){
            throw new TestException("ERROR: Not on SHOPPING_CART_REVIEW_PAGE! URL: " + url);
        }
    }

    public String getCartSubtotal(){
        return getElementText(PRICE);
    }

    public void clickProceedToCheckoutButton(){
        logger.info("Clicking on Proceed To Checkout button.");
        click(PROCEED_TO_CHECKOUT_BUTTON);
    }

    public void clickCartButton() {
        logger.info("Clicking on Cart button.");
        click(CART_BUTTON);
    }
}
