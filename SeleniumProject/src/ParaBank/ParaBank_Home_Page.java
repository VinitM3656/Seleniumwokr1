package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank_Home_Page {
    private static final String ElementAction = null;
	WebDriver driver;

    public ParaBank_Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By WelcomeAfterLogin() {
        return By.xpath("//h1[contains(.,'Accounts Overview')]");
    }

    public static By WelcomeAfterRegister() {
        return By.xpath("//h1[@class='title']");
    }

    private By LogOut() {
        return By.linkText("Log Out");
    }

    private By OpenNewAccount() {
        return By.xpath("//a[contains(.,'Open New Account')]");
    }

    public OpenNewAccount_Page ClickOnOpenNewAccount() {
        ElementAction.click(driver, OpenNewAccount());
        return new OpenNewAccount_Page(driver);
    }

    public ParaBank_Home_Page ClickOnLogOut() {
        ElementAction.click(driver, LogOut());
        return new ParaBank_Home_Page(driver);
    }
}
