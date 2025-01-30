import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

//package Selenium_concepts;

public class Navigation{

    public static void main(String[] args) {
        try {
            ChromeDriver driver = new ChromeDriver();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.get("https://www.facebook.com");

            Thread.sleep(2000);
            WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?"));

            forgotPassword.click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().forward();
            Thread.sleep(3000); // corrected parenthesis here
            
            
            driver.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
