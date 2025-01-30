package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com");

        // Typing into the username field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Typing into the password field using starts-with XPath
        driver.findElement(By.xpath("//*[starts-with(@name,'password')]"))
                .sendKeys("secret_sauce");

        // Clicking on the login button
        driver.findElement(By.id("login-button")).click();

        // Handling the alert if present
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            // Alert not present, continue
        }

        // Adding items to the cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        // Closing the browser
        driver.quit();
    }
}
