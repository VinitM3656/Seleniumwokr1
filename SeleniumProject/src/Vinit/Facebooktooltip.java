package Vinit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktooltip {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement registrationLink = driver.findElement(By.xpath("//a[@href='/reg/']"));
        String actualTooltip = registrationLink.getAttribute("title");
        String expectedTooltip = "Sign Up for Facebook";

        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
    }
}
