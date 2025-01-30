package stepdefination;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import org.junit.Assert;

public class StepDef {
 public WebDriver driver;
 
 
     public LoginPage loginPage;

    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        //driver = new ChromeDriver();
        
        
      //  loginPage = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("Clicks on login")
    public void clicks_on_login() {
        loginPage.clickOnLoginButton();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User clicks on log out link")
    public void user_clicks_on_log_out_link() {
        // Implement log out functionality if it exists in the LoginPage class
        // loginPage.clickOnLogoutButton(); // Example
    }

    @Then("Page title should be {string}")
    public void page_title_should_be_after_logout(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("Close browser")
    public void close_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
