package Vinit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement element =  driver.findElement(By.id("input-country"));

        Select dropdown = new Select(element);
        dropdown.selectByVisibleText("Hong Kong");
        dropdown.selectByValue("98");
        dropdown.selectByIndex(3);

        if (dropdown.isMultiple()) {
            System.out.println("Drop down is multiple");
        } else {
            System.out.println("Drop Down is not multiple");
        }

        List<WebElement> allDropdownOptions = dropdown.getOptions();
        System.out.println("Total options: " + allDropdownOptions.size());

        for (WebElement option : allDropdownOptions) {
            System.out.println(option.getText());
        }

        driver.close();
    }
}
