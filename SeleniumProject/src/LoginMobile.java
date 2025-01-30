
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMobile {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the Amazon website
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        // Find the "Sign in" link and click on it
        By signInLinkLocator = By.id("nav-link-accountList");
        WebElement signInLink = driver.findElement(signInLinkLocator);
        signInLink.click();

        // Find the "Sign in with your mobile number" button and click on it
        By mobileSignInButtonLocator = By.id("ap_signin_promo");
        WebElement mobileSignInButton = driver.findElement(mobileSignInButtonLocator);
        mobileSignInButton.click();

        // Find the mobile number input field and enter your mobile number
        By mobileNumberInputLocator = By.id("ap_phone_number");
        WebElement mobileNumberInput = driver.findElement(mobileNumberInputLocator);
        mobileNumberInput.sendKeys("9552328673");

        // Find the "Continue" button and click on it
        By continueButtonLocator = By.id("continue");
        WebElement continueButton = driver.findElement(continueButtonLocator);
        continueButton.click();

        // You may need to handle additional steps, such as entering the OTP sent to your mobile number

        // Wait for a few seconds to observe the result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
