
package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

Public class CartTest extends AbstractMethods {
    WebDriver driver;{

Public static void main(String[]args){

System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

Driver.get(http:automationexercise.com);
Try{
Thread.sleep(5000);
}
Catch(InterruptExeption e){
e.printStackTrace();
}

WebElement viewProductButton = driver.findElement(By.xpath(“[a@class=’btn btn-primary’]”));
viewProductButton.click();
WebElement quantityInput  = driver.findElement(By.id(“quantity_input”));
quantityInput.clear();
quantityInput.sendKeys(“4”);
WebElement addToCartButton = driver.findElement(By.id(“add to cart button”));
addToCartButton.click();
        WebElement viewCartButton = driver.findElement(By.xpath("//a[@href='/cart']"));
        viewCartButton.click();
WebElement cartProduct = driver.findElement(By.xpath("//td[contains(text(), 'Soft Streach Jeans')]"));

        WebElement cartQuantity = driver.findElement(By.xpath("//td[contains(text(), 'SoftJeans')]/following-sibling::td[@class='quantity']"));

        if (cartProduct.isDisplayed() && cartQuantity.getText().equals("4")) {
            System.out.println("Product is displayed in cart with exact quantity.");
        } else {
            System.out.println("Product is not displayed in cart with the expected quantity.");
        }
        driver.quit();
    }

