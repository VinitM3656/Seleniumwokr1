package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationExerciseExistingEmailSignup extends AbstractMethods {
        WebDriver driver;{


public static void main(String[]args)
{

System.setProperty”( "webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http:automationexercise.com);
WebElement homePageElement = driver.findElement(By.xpath(“[text()=’Home page Element]”));

If (homePageElement.isDisplay()){

System.out.println(“Home page is visible successfully”);
]
Else{
System.out.println(“Home page is not visible”);
}

WebElement signupLoginButton = driver.findElement(By.xpath(“button[contains(text(),Signup/Login)]”));
signupLoginButton.click();
WebElement newUserSignup = driver.findElement(By.xpath("[contains(text(),'New User Signup!')]"));
If (newUserSignup.isDisplayed()){

System.out.println(“New User is signup”);
} else{
System.out.println(“New User is signup!,is not visible”);
}
WebElement nameField= driver.fieldElement(by.id(RohitN@gmail.com)
emailField.sendKeys(“RohitN@gmail.com);

WebElement signupButton = driver.findElement(By.xpath(“button[conatains(text(),Signup)]”));
signupButton.click();


        WebElement errorElement = driver.findElement(By.xpath("[contains(text(),'Email Address already exist!')]"));

If (errorElement.isDisplayed()){

System.out.println(“Email is already exist”);
}
Else{
System.out.println(“Email address alredy exist! Error is not visible”);
}
Driver.quite();
}
}
