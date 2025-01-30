package Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Xpathl {

    public static void main(String[] args) throws InterruptedException {
        // Setting the system property for ChromeDriver
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");

        // Creating a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the Sauce Demo web page
        driver.get("http://www.saucedemo.com");

        // Locate the username field by id and enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Locate the password field by name and enter password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        // Locate the login button by class name and click it
        driver.findElement(By.className("btn_action")).click();

        Thread.sleep(4000);
        // Switch back to the product page
        String currWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currWindowHandle);

        // Locate the Sauce Labs Bolt T-Shirt by partial link text
        List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
        System.out.println("Element size:" + elementList.size());

        // Close the browser
        driver.quit();
    }
}
