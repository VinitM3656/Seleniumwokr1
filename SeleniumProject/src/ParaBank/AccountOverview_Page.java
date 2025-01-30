package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverview_Page {
    private WebDriver driver;

    public AccountOverview_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By AccountOverviewDisplayedLocator() {
        return By.xpath("//h1[contains(.,'Accounts Overview')]");
    }
}
