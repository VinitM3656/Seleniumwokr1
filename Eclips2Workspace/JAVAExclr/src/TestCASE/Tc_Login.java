package TestCASE;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Home_Page;
import POM.Login_Page;

public class Tc_Login {
    @Test
    void login() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://demowebshop.tricents.com");

        Home_Page hp = new Home_Page(driver);
        hp.clickLoginLink();

        Login_Page lp = new Login_Page(driver);
        lp.setEmail("abc@gmail.com"); // Corrected method name to follow camelCase convention
        lp.setPassword("123456789"); // Corrected method name to follow camelCase convention
        lp.clickLoginButton(); // Corrected method name to follow camelCase convention
    }
}
