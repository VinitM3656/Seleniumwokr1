package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpeningPage {
    private WebDriver driver;

    public AccountOpeningPage(WebDriver driver) {
        this.driver = driver;
    }

    public static By AccountOpenedDisplayed() {
        return By.xpath("//h1[contains(.,'Accounts Opened')]");
    }

    public By AccountsOverview() {
        return By.xpath("//a[contains(.,'Accounts Overview')]");
    }

    public AccountOverviewPage ClickOnAccountsOverview() {
        ElementActions.click(driver, AccountsOverview());
        return new AccountOverviewPage(driver);
    }
}
