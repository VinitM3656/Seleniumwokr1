package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTest extends Abstract {
    public AutomatedTest(WebDriver driverhere) {
		super(driverhere);
	
	}

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        WebElement categoriesSidebar = driver.findElement(By.xpath("//h2[normalize-space()='Category']"));
        if (categoriesSidebar.isDisplayed()) {
            System.out.println("Categories are visible on the left sidebar");
        }

        WebElement womenCategory = driver.findElement(By.xpath("//a[normalize-space()='Women']"));
        womenCategory.click();

        WebElement dressCategory = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        dressCategory.click();

        WebElement categoryPageText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        if (categoryPageText.getText().contains("Women-Top Product")) {
            System.out.println("Category page for Women-Top Product is displayed.");
        } else {
            System.out.println("Category page for Women-Top Products is not displayed");
        }

        WebElement menSubCategory = driver.findElement(By.xpath("//a[normalize-space()='Men']"));
        menSubCategory.click();

        driver.quit();
    }
}

