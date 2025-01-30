package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexcercise.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement homePageElement = driver.findElement(By.xpath("[text()='Home Page Element']"));

        if (homePageElement.isDisplayed()) {
            System.out.println("Home page is visible");
        } else {
            System.out.println("Home page is not visible");
        }

        WebElement signupLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Signup / Login')]"));
        signupLoginButton.click();

        WebElement loginToAccount = driver.findElement(By.xpath("//*[contains(text(),'Login to your account')]"));

        if (loginToAccount.isDisplayed()) {
            System.out.println("Login to your account is visible");
        } else {
            System.out.println("Login to your account is not visible");
        }

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("Vinitbmhetre@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Rohit@345");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();

        WebElement loggedInText = driver.findElement(By.xpath("//div[contains(text(),'Logged in as username')]"));

        if (loggedInText.isDisplayed()) {
            System.out.println("'Logged in as username' is visible");
        } else {
            System.out.println("'Logged in as username' is not visible");
        }

        WebElement logoutButton = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
        logoutButton.click();

        WebElement loginPage = driver.findElement(By.xpath("//div[contains(text(),'Login to your account')]"));

        if (loginPage.isDisplayed()) {
            System.out.println("User is navigated to the login page after logout");
        } else {
            System.out.println("User is not navigated to the login page after logout");
        }

        driver.quit();
    }
}
