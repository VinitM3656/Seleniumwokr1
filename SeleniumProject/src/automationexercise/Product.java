package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Product extends Abstract{
    public Product(WebDriver driverhere) {
		super(driverhere);
		
	}

	WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationexercise.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement productsButton = driver.findElement(By.linkText("Products"));
        productsButton.click();

        WebElement viewProductButton = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]"));
        viewProductButton.click();

        WebElement productName = driver.findElement(By.id("product_name"));
        WebElement category = driver.findElement(By.id("product_category"));
        WebElement price = driver.findElement(By.id("Product_price"));
        WebElement availability = driver.findElement(By.id("product_availability"));
        WebElement condition = driver.findElement(By.id("product_condition"));
        WebElement brand = driver.findElement(By.id("product_brand"));

        if (productName.isDisplayed() && category.isDisplayed() && price.isDisplayed() &&
                availability.isDisplayed() && condition.isDisplayed() && brand.isDisplayed()) {
            System.out.println("Product details are visible");
        } else {
            System.out.println("Product details are not visible");
        }

        driver.quit();
    }
}
