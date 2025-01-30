package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveFromAmazonCart {

    public static void main(String[] args) {
      
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

      
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.amazon.in/");

       
        searchAndAddToCart(driver, "iPhone 12");

     
        navigateToCart(driver);

      
        removeItemFromCart(driver, "iPhone 12");

     
       driver.quit();
    }

    private static void searchAndAddToCart(WebDriver driver, String searchTerm) {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchTerm);
        driver.findElement(By.cssSelector("input[value='Go']")).click();

      
        driver.findElement(By.cssSelector(".s-result-item")).click();

        driver.findElement(By.id("add-to-cart-button")).click();
    }

    private static void navigateToCart(WebDriver driver) {
        driver.findElement(By.id("nav-cart")).click();
    }

    private static void removeItemFromCart(WebDriver driver, String itemName) {
        
        String removeLinkSelector = String.format("//*[text()='%s']/ancestor::div[@data-asin][1]//input[@value='Delete']", itemName);
        WebElement removeLink = driver.findElement(By.xpath(removeLinkSelector));

      
        removeLink.click();

       
        driver.findElement(By.cssSelector("input[value='Delete']")).click();
    }
    

}
