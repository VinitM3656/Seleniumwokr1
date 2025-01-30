package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class ProductSearchTest extends Abstract{
    public ProductSearchTest(WebDriver driverhere) {
		super(driverhere);
		
	}

	WebDriver driver;

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement productsButton = driver.findElement(By.linkText("Products"));
        productsButton.click();

        String productNameToSearch = "Sleeves Printed Tshirts";
        WebElement searchInput = driver.findElement(By.id("Search_input"));
        searchInput.sendKeys(productNameToSearch);

        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();

        WebElement searchedProductsTitle = driver.findElement(By.xpath("//h2[contains(text(), 'SEARCHED PRODUCTS')]"));

        if (searchedProductsTitle.isDisplayed()) {
            System.out.println("Searched Products section is visible");
        } else {
            System.out.println("Searched Products section is not visible");
        }

        List<WebElement> searchResults = driver.findElements(By.className("product-item"));

        if (searchResults.size() > 0) {
            System.out.println("Related products are visible after search:");
            for (WebElement result : searchResults) {
                System.out.println(result.getText());
            }
        } else {
            System.out.println("No related products found after search.");
        }

        driver.quit();
    }
}
