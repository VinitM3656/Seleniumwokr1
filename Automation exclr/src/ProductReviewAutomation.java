
package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductReviewAutomation extends AbstractMethods {
    WebDriver driver;{
    public static void main(String[] args) {
        System.setProperty(""webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe"");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationexercise.com");
        WebElement productsButton = driver.findElement(By.xpath ("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]])");
        productsButton.click();
        WebElement viewProductButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]]"));
        viewProductButton.click();
        WebElement writeReviewElement = driver.findElement(By.xpath(“/textarea[@id=review])"");
        if (writeReviewElement.isDisplayed()) {
            
            WebElement nameField = driver.findElement(By.xpath (“input[@id=name]""));
            nameField.sendKeys("Vinit");

            WebElement emailField = driver.findElement(By.xpath (“input[@id=email]""));
            emailField.sendKeys("VinitM@gmail.com");

            writeReviewElement.sendKeys("This product is great!");
            WebElement submitButton = driver.findElement(By.xpath ("button[@id='button-review']]"));
            submitButton.click();

            
            WebElement successMessage = driver.findElement(By.xpath(“ span[normalize-space()=Thank you for your review.]""));
            if (successMessage.isDisplayed()) {
                System.out.println("Review submitted successfully!");
            } else {s
                System.out.println("Review submission failed!");
            }
        } else {
            System.out.println("'Write Your Review' element is not visible.");
        }
        driver.quit();
    }
}
