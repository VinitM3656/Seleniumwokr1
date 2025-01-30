package automationexercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {

    WebDriver driver;

    public Abstract(WebDriver driverhere) {
        this.driver = driverhere;
    }

    public void waitTillLinkIsClickable(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(findBy));
    }

    public void hoverAnyElement(WebElement el) {
        Actions ac = new Actions(driver);
        ac.moveToElement(el).build().perform();
    }

    public void implicitlyWaitMethod() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
}
