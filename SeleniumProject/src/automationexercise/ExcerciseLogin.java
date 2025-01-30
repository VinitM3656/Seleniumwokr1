package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcerciseLogin extends Abstract {
    public ExcerciseLogin(WebDriver driverhere) {
		super(driverhere);
		
	}

	WebDriver driver;

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        WebElement homePageElement = driver.findElement(By.xpath("//text()='Home page Element']"));

        if (!homePageElement.isDisplayed()) {
            System.out.println("Home page is not visible");
        }

        WebElement signupLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Signup/Login')]"));
        signupLoginButton.click();

        WebElement loginToAccount = driver.findElement(By.xpath("//contains(text(),'Login to your account')]"));

        if (loginToAccount.isDisplayed()) {
            System.out.println("Login to your account is visible");
        } else {
            System.out.println("Login to your account is not visible");
        }

        WebElement emailField = driver.findElement(By.id("Vinitb@gmail.com"));
        emailField.sendKeys("Vinitb@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Vinitexcler@1234"));
        passwordField.sendKeys("Vinitexclr@1234");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'login')]"));
        loginButton.click();

        WebElement loggedInText = driver.findElement(By.xpath("//contains(text(),'logged as username')]"));

        if (loggedInText.isDisplayed()) {
            System.out.println("Username is visible");
        } else {
            System.out.println("Username is not visible");
        }

        WebElement deleteAccountButton = driver.findElement(By.xpath("//button[contains(text(),'Delete Account')]"));
        deleteAccountButton.click();

        WebElement accountDeleted = driver.findElement(By.xpath("//*[contains(text(),'ACCOUNT DELETED!')]"));

        if (accountDeleted.isDisplayed()) {
            System.out.println("Account is deleted is visible");
        } else {
            System.out.println("Account deleted is not visible");
        }

        driver.quit();
    }
}
