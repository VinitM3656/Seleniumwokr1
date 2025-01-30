package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseExistingEmailSignup extends Abstract {
    public AutomationExerciseExistingEmailSignup(WebDriver driverhere) {
        super(driverhere);
        this.driver=driverhere;
        PageFactory.initElements(driver,this );
    }
    

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        WebElement homePageElement = driver.findElement(By.xpath("//text()='Home page Element']"));

        if (homePageElement.isDisplayed()) {
            System.out.println("Home page is visible successfully");
        } else {
            System.out.println("Home page is not visible");
        }

        WebElement signupLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Signup/Login')]"));
        signupLoginButton.click();

        WebElement newUserSignup = driver.findElement(By.xpath("//contains(text(),'New User Signup!')]"));
        if (newUserSignup.isDisplayed()) {
            System.out.println("New User Signup page is visible");
        } else {
            System.out.println("New User Signup page is not visible");
        }

        WebElement nameField = driver.findElement(By.id("RohitN@gmail.com"));
        nameField.sendKeys("RohitN@gmail.com");

        WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
        signupButton.click();

        WebElement errorElement = driver.findElement(By.xpath("//contains(text(),'Email Address already exists!')]"));

        if (errorElement.isDisplayed()) {
            System.out.println("Email Address already exists!");
        } else {
            System.out.println("Email Address already exists! Error is not visible");
        }

        driver.quit();
    }
}
