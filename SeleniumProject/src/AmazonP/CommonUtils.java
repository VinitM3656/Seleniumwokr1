package AmazonP;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestException;

import java.util.List;

public abstract class CommonUtils {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    private Select select;
    private int timeout = 10;

    // Use SLF4J logger
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    public CommonUtils() {
        
    }

    public void navigateToURL(String URL) {
        try {
            driver.navigate().to(URL);
        } catch (Exception e) {
            logErrorAndThrow(String.format("FAILURE: URL %s did not load!", URL), e);
        }
    }

    public void scrollToThenClick(By selector) {
        WebElement element = driver.findElement(selector);
        actions = new Actions(driver);
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            actions.moveToElement(element).click(element).perform();
        } catch (Exception e) {
            logErrorAndThrow(String.format("ERROR: The following element is not clickable: [%s]!", element), e);
        }
    }

   

    private void logErrorAndThrow(String message, Exception e) {
      
        logger.error(message, e);
    
        throw new TestException(message, e);
    }
}
