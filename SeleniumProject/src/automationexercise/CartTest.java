package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CartTest extends Abstract {
    public CartTest(WebDriver driverhere) {
		super(driverhere);
		
	}

	WebDriver driver;

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://automationexercise.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement viewProductButton = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        viewProductButton.click();

        WebElement quantityInput = driver.findElement(By.id("quantity_input"));
        quantityInput.clear();
        quantityInput.sendKeys("4");

        WebElement addToCartButton = driver.findElement(By.id("add_to_cart_button"));
        addToCartButton.click();

        WebElement viewCartButton = driver.findElement(By.xpath("//a[@href='/cart']"));
        viewCartButton.click();

        WebElement cartProduct = driver.findElement(By.xpath("//td[contains(text(), 'Soft Stretch Jeans')]"));
        WebElement cartQuantity = driver.findElement(By.xpath("//td[contains(text(), 'Soft Stretch Jeans')]/following-sibling::td[@class='quantity']"));

        if (cartProduct.isDisplayed() && cartQuantity.getText().equals("4")) {
            System.out.println("Product is displayed in the cart with the expected quantity.");
        } else {
            System.out.println("Product is not displayed in the cart with the expected quantity.");
        }

        driver.quit();
    }
}
