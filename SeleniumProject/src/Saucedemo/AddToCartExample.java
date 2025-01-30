package Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartExample {

    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinit\\Documents\\Selenium\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();       
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();  
        
        // Added a pause for demonstration purposes (not recommended for real tests)
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));

        if (cartBadge.getText().equals("1")) {
            System.out.println("Product successfully added to the cart.");
        } else {
            System.out.println("Failed to add the product to the cart.");
        }
        driver.quit();
    }
}
