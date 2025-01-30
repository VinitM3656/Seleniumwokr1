package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExerciseInvalidLogin extends Abstract{
    public AutomationExerciseInvalidLogin(WebDriver driverhere) {
		super(driverhere);
		
	}

	WebDriver driver;

    public static void main(String[] args) {
       //s System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        WebElement homePageElement = driver.findElement(By.xpath("//*[text()='home page element']"));

        if (homePageElement.isDisplayed()) {
            System.out.println("Home page is visible");
        } else {
            System.out.println("Home page is not visible");
        }

        WebElement signupLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Signup / Login')]"));
        signupLoginButton.click();

        WebElement loginToAccount = driver.findElement(By.xpath("//*[contains(text(),'login to your account')]"));

        if (loginToAccount.isDisplayed()) {
            System.out.println("Login to your account is visible");
        } else {
            System.out.println("Login to your account is not visible");
        }

        WebElement emailField = driver.findElement(By.id("Vinitb@gmail.com"));
        emailField.sendKeys("Vinitbm@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Vinneet@1234"));
        passwordField.sendKeys("Vineet@1234");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();

        WebElement errorElement = driver.findElement(By.xpath("//*[contains(text(),'Your email or password is incorrect!')]"));

        if (errorElement.isDisplayed()) {
            System.out.println("'Your email or password is incorrect!' error is visible");
        } else {
            System.out.println("'Your email or password is incorrect!' error is not visible");
        }

        driver.quit();
    }
}
