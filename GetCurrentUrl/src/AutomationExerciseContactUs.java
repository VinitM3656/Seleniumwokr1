

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import java.io.File;

public class AutomationExerciseContactUs{

public station void main(String[]args){

System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http://automationexercise.com);
WebElement homePageElement = driver.findElement(By.xpath("//*[text()='Home Page Element']"));

If (homPageElement.isDisplayed())
{
System.out.println(“Home page is visible successful”);
}
Else{
System.out.println(“Home page is not visible ”);
}
        WebElement contactUsButton = driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]"));
        contactUsButton.click();
        WebElement getInTouch = driver.findElement(By.xpath("//*[contains(text(),'GET IN TOUCH')]"));
        if (getInTouch.isDisplayed()) {
System.out.println(“Get in touch  is visble”);
}
Else{
System.out.println(“Get in touch is not visible”);
}
        WebElement nameField = driver.findElement(By.id("Name")); 
        nameField.sendKeys("Puneet");

WebElement emailFiled = driver.FieldElement(By.id(“Email);
emailFiled.sendkeys(“PuneetR123@gmail.com”);

WebElement subjectField = driver.Findelement(By.id(“subject”));
subjectField.sendKeys(“English”);
WebElement messageField = driver.fieldElement(By.id(“message”));
messageField.sendKeys(“Item is not good”);
WebElement Fileinput = driver.findElement(By.id(“file”));
File fileToUpload = new File(D:\ExclrAutomation\file.txt);
fileInput.sendKeys(fileToUpload.getAbsolutePath());
WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click();


driver.switchTo().alert().accept();

WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(),'Success! Your details have been submitted successfully.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Success message is visible");
        } else {
            System.out.println("Success message is not visible");
        WebElement homeButton = driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        homeButton.click();
        WebElement homePageVerification = driver.findElement(By.xpath("//*[text()='Home Page Element']"));
        if (homePageVerification.isDisplayed()) {
            System.out.println("Landed on the home page successfully");
        } else {
            System.out.println("Failed to land on the home page");
        }

        driver.quit();
    }
}

