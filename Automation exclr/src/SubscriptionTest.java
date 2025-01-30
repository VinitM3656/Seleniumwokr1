
package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriptionTest extends AbstractMethods {
    WebDriver driver;{

public static void main(String[]args){
System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http:automationexercise.com);
Try{
Thread.sleep(5000);
}
Catch(InterruptedExeption e){
e.printStackTrace();
}

JavascriptExecuter js = (javascriptExecutor)driver;
Js.executeScript(“window.scrollTo(0,document.body.scrollHeight)”);
WebElement subscriptionText = driver,findElement(By.xpath(“h2[contains(text(),Subscription)]”));
If (subscriptionText.isDisplayed())
{
System.out.println(‘Subscription’text is visible in the footer”);
} else{
System.out.println(‘Subscription ‘text is not visible in the footer”);
}

String email=puneetBm@gmail.com:
WebElement emailInput = driver.findElement(By.id(email_input”));
emailInput.sendKeys(email);
WebElement arrowButton = driver.findElement(By.id(“arrow_button”));
arrowButton.click();
WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(), 'You have been successfully subscribed!')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Success message 'You have been successfully subscribed!' is visible.");
        } else {
            System.out.println("Success message is not visible or subscription failed.");
        }
        driver.quit();
    }
}





