package Repractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.saucedemo.com");
            Thread.sleep(2000);
            
            WebElement userName = driver.findElement(By.id("user-name"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement login = driver.findElement(By.id("login-button"));
            
            Thread.sleep(2000);
            userName.sendKeys("standard_user");
            Thread.sleep(3000);
            password.sendKeys("secret_sauce");
            Thread.sleep(3000);
            login.click();
            Thread.sleep(3000);
            
            WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(dropdownElement); // Corrected the object creation
            
            Thread.sleep(2000);
            select.selectByIndex(1);
            Thread.sleep(2000);
            
            driver.quit(); // Close the browser
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
