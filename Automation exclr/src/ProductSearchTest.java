
package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.list;

public class ProductSearchTestextends AbstractMethods {
    WebDriver driver;{

public static void main(String[]args){
System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();
Driver.get(http:automationexercise.com);
Try{
Thread.sleep(5000);
}
Catch(InterruptedException e){
e.printStackTrace();
}
WebElement productsButton = driver.findElement(By.linkText("Products"));
        productsButton.click();
String productNameToSearh = “ Sleeves Printed Tshirts”;
WebElement searchInput = driver.findElement(By.id(“Search_input”));
searchInput.sendKeys(productNameToSearch);

WebElement searchButton = driver.findElement(By.id(“search_button”));
searchButton.click();
WebElement searchedProductsTitle = driver.findElement(By.xpath("//h2[contains(text(), 'SEARCHED PRODUCTS')]"));
If(SearchedProductsTitle.isDisplayed(){
System.out.println(“Searched Products’visible section”);
}
Else{
System.out.println(“Searche Products section is not visible”);
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
        driver.
