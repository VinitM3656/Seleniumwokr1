
package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product extends AbstractMethods {
        WebDriver driver;{

public static void main(String[] args){

System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get(http:automationexercise.com);
try{

Thread.sleep(6000);
}
Catch(InterruptedException e){
e.printStackTrace();
WebElement productsButton = driver.findElement(By.linkText(“Products”));

productsButton.click();
        WebElement viewProductButton = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]"));
        viewProductButton.click();
 WebElement productName = driver.findElement(By,id(“product_name”));
WebElement category = driver.findElement(by.id(“product_cayegory”));
WebElement price = driver.findElement(By.id(“Product_price”));
WebElement availability = driver.findElement(By.id(“product_availabilty”));
WebElement condtion = driver.findElement(By.id(“product_condtion”));
WebElement condtion = driver.findElement(By.id(“product_brand”));



If(productName.isDisplayed()&& category.isDisplayed()&&price.isDisplayed()&&availability.isDisplayed()&&condition.isDisplayed()&&brand.isDisplayed())
{
System.out.println(“Product details are visible”);
}
Else{

System.out.println(“Product details are not visible”);
}
Driver.quit();
}
}

