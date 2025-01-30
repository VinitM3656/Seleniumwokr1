package AmazonP;



import enums.Products;
import enums.Url;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestException;
import utils.CommonUtils;


 
public class ProductPage extends CommonUtils {

    private final By PRODUCT_TITLE = By.cssSelector("#productTitle");
    private final By AUTHOR = By.cssSelector(".a-link-normal.contributorNameID");
    private final By EDITION = By.cssSelector(".a-size-medium.a-color-secondary.a-text-normal");
    private final By PRICE = By.cssSelector(".a-size-medium.a-color-price.offer-price.a-text-normal");
    private final By ADD_TO_CART = By.cssSelector("#add-to-cart-button");

  
    private static final Logger logger = LoggerFactory.getLogger(ProductPage.class);

    public void navigateToProductPage(Process product){
        String url = Url.BASEURL.getURL() + Url.PRODUCT_SECTION.getURL() + "/" + product.getProductId();
        navigateToURL(url);
        logger.info("Navigated to {}", url);
    }

    public void verifyProductTitle(String expectedTitle){
        String actualTitle = getProductTitle();
        logger.info("Verifying that the product title is '{}'", actualTitle);
        if (!expectedTitle.equals(actualTitle)){
            throw new TestException("ERROR: Product Title is ['" + actualTitle + "']. Expected ['" + expectedTitle + "'].");
        }
    }

    public String getProductTitle(){
        return getElementText(PRODUCT_TITLE);
    }

    private String getElementText(By pRODUCT_TITLE2) {
		
		return null;
	}

	public String getAuthor(){
        return getElementText(AUTHOR);
    }

    public String getEdition(){
        return getElementText(EDITION);
    }

    public String getPrice(){
        return getElementText(PRICE);
    }

    public void clickAddToCart(){
        logger.info("Clicking on [ADD_TO_CART] button.");
        click(ADD_TO_CART);
    }

	private void click(By aDD_TO_CART2) {
		
		
	}
}
