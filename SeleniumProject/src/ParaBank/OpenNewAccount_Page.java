package ParaBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccount_Page {
    private static final String ElementAction = null;
	private WebDriver driver;

    public OpenNewAccount_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By WhatTypeOfAccountDisplayed() {
        return By.xpath("//b[contains(.,'what type of Account would you like to open?')]");
    }

    private By SubmittedOpenNewAccount() {
        return By.xpath("//input[@type='submit']");
    }

    public AccountOpeningPage ClickOnOpenNewAccountSubmitButton() {
        ElementAction.click(driver, SubmittedOpenNewAccount());
        return new AccountOpeningPage(driver);
    }
}
