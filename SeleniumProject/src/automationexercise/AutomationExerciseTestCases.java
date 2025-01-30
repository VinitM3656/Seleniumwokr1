package automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExerciseTestCases extends Abstract {
    public AutomationExerciseTestCases(WebDriver driverhere) {
		super(driverhere);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\MOVIES\\chromedriver-win64.zip\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationexercise.com");

        WebElement homePageElement = driver.findElement(By.xpath("//text()='Home Page Element']"));

        if (homePageElement.isDisplayed()) {
            System.out.println("Home page is visible successfully");
        } else {
            System.out.println("Home page is not visible");
        }

        WebElement testCasesButton = driver.findElement(By.xpath("//button[contains(text(),'Test Cases')]"));
        testCasesButton.click();

        WebElement testCasesPageElement = driver.findElement(By.xpath("//contains(text(),'Test Cases Page Element')]"));

        if (testCasesPageElement.isDisplayed()) {
            System.out.println("Navigated to Test Cases page successfully");
        } else {
            System.out.println("Failed to navigate to Test Cases page");
        }

        driver.quit();
    }
}
