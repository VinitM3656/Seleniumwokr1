import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankHomePage {
   
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://parabank.parasoft.com/parabank/index.htm");

          
            WebElement openNewAccountLink = driver.findElement(By.linkText("Open New Account"));
            openNewAccountLink.click();

           
            WebElement customerIDField = driver.findElement(By.name("customer.firstName"));
            customerIDField.sendKeys("John");

            WebElement customerLastNameField = driver.findElement(By.name("customer.lastName"));
            customerLastNameField.sendKeys("Doe");

            WebElement customerAddressField = driver.findElement(By.name("customer.address.street"));
            customerAddressField.sendKeys("123 Main St");

           

          
            WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
            submitButton.click();

          
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
