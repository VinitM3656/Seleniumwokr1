package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.open.selenium.WebElement;
import org.openqa.selenium.chrom.ChromDriver;


public class AutomatedTest extends AbstractMethods {
	WebDriver driver;{

public static void main(String[] args){

System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");
WebDriver driver = new ChromDriver();
Driver.get("http:automationexercise.com");
WebElement categoriesSidebar = Driver.findElement(“h2[normalize-space()="Category"]”);
If (categoriesSidebar.isDisplay())
{
System.out.println(“Categories are visible on the left sidebar”);
}

WebElement womenCategory = driver.findElement(a[normalize-space()='Women);
WomenCategory.click();
WebElement dressCategory = driver.findElement(By.xpath(“h2[@class='title text-center]”));
dressCategory.click();

WebElement categoryPageText = driver.findElement(By.xpath(“h2[@class="title text-center"]”));
If(categoryPageText.getText().contains(“Women-Top Product”))
{
System.out.println(“Category page for Women- Top Product  is displayed.”);
}
Else
{
System.out.println(“Category page for Women- Top Products is not displayed”);
}

WebElement menSubCategory = driver.findElement(By.xpath(“a[normalize-space()="Men"]”));
menSubCategory.click();

driver.quit();
}
}


