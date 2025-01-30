package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ProductReviewAutomation extends Abstract{
    public ProductReviewAutomation(WebDriver driverhere) {
		super(driverhere);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationexercise.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement productsButton = driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Products')]"));
        productsButton.click();

        WebElement viewProductButton = driver.findElement(By.xpath("//a[contains(text(),'View Product')]"));
        viewProductButton.click();

        WebElement writeReviewElement = driver.findElement(By.xpath("//textarea[@id='input-review']"));

        if (writeReviewElement.isDisplayed()) {
            WebElement nameField = driver.findElement(By.xpath("//input[@id='input-name']"));
            nameField.sendKeys("Vinit");

            WebElement emailField = driver.findElement(By.xpath("//input[@id='input-email']"));
            emailField.sendKeys("VinitM@gmail.com");

            writeReviewElement.sendKeys("This product is great!");

            WebElement submitButton = driver.findElement(By.xpath("//button[@id='button-review']"));
            submitButton.click();

            WebElement successMessage = driver.findElement(By.xpath("//span[normalize-space()='Thank you for your review.']"));

            if (successMessage.isDisplayed()) {
                System.out.println("Review submitted successfully!");
            } else {
                System.out.println("Review submission failed!");
            }
        } else {
            System.out.println("'Write Your Review' element is not visible.");
        }

        driver.quit();
    }
}
