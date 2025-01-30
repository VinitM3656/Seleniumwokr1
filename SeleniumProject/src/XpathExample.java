import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.get("file:///D:/cctv/new%202.html"); // Corrected file path with file:/// and space encoded as %20

            Thread.sleep(4000);
            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']")); // Assuming the input field has an ID 'firstName'
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']")); // Assuming the input field has an ID 'lastName'

            Thread.sleep(3000);
            firstName.sendKeys("Vinit");
            Thread.sleep(2000);
            lastName.sendKeys("Bhimashanar");

            Thread.sleep(2000);
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
