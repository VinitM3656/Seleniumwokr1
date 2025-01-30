
package Amazon;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFlightBooking {

    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();

      
        driver.manage().window().maximize();

     
        driver.get("https://www.amazon.in/Flight-Booking-Ticket/s?k=Flight+Booking+Ticket");

    
        By searchBoxLocator = By.id("twotabsearchtextbox");
        WebElement searchBox = driver.findElement(searchBoxLocator);

        searchBox.sendKeys("flight tickets");

        By searchButtonLocator = By.id("nav-search-submit-button");
        WebElement searchButton = driver.findElement(searchButtonLocator);

      
        searchButton.click();

   
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    
        driver.quit();
    }
}
