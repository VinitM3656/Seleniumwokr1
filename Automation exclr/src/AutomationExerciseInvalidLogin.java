
package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationExerciseInvalidLogin extends AbstractMethods {
        WebDriver driver;{

public static void main(String[] args){

System.setProperty("webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http:automationexercise.com);
WebElement homePageElement = driver.findElement(By.xpath(“*[text()=’home page element’]”));

If(homePageElement.isDisplayed()){
System.out.println(“Home page is visible”);
}
Else{
System.out.println(“Home page is not visible”);
}

        WebElement signupLoginButton = driver.findElement(By.xpath("button[contains(text(),'Signup / Login')]"));
signupLoginButton.click();

WebElement loginToAccount = driver.findElement(By.xpath(“*[contains(text(),login to your account)]”));

If (login ToAccount .isDisplayed()){

System.out.println(“login to your account is visible”);
}
Else{
System.out.println(“login to your account is not visible”);
}

WebElement emailField = driver.findElement(By.id(Vinitb@gmail.com));
emailField.sendKeys(“Vinitbm@gmail.com”);
        WebElement passwordField = driver.findElement(By.id("Vinneet@1234"));
passwordField.sendKeys(“Vineet@1234”);
        loginButton.click();
        WebElement errorElement = driver.findElement(By.xpath("[contains(text(),'Your email or password is incorrect!')]"));
        if (errorElement.isDisplayed()) {
            System.out.println("'Your email or password is incorrect!' error is visible");
        } else {
            System.out.println("'Your email or password is incorrect!' error is not visible");
        }
        driver.quit();
    }
}




