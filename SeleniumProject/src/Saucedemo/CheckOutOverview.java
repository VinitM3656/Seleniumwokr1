package Saucedemo; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverview {

    private WebDriver driver;

    @FindBy(id = "someElementId")
    private WebElement someElement;

  
    public CheckOutOverview(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    

    public void performSomeAction() {
    
    }

    public String retrieveSomeInformation() {
        
        return "Some information";
    }

  
}
