package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ExcerciseLogin extends AbstractMethods {
  WebDriver driver;{

public static void main(String[] args){
System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http:automationexercise.com);
WebElement homePageElement = driver.findElement(By.xpath(“[text()=’Home page Element’]”));

If (homePageElement.isDisplayed()){
System.out.println(“Home page is not visible”);
}
WebElement signupLoginButton = driver.findElement(“By.xpath(“button[contains(text(),’Signup/Login’)]”));
SignupLoginButton.click();
WebElement loginToAccount = driverfind.Element(By.xpath(“[contains(text(),’Login to your account’)]”));

If (loginToAccount.is Displayed()){

System.out.println(“Login to your account is visible”);
}
Else{

System.out.println(“Login to your account is not visible”);
}
WebElement emailField = driver.findElement(by.id(Vinitb@gmail.com));
emailField.sendKeys(Vinitb@gmail.com);
WebElement emailField = driver.findElement(by.id(“Vinitexcler@1234”);
passwordField.sendKeys(“Vinitexclr@1234”);
WebElement loginButton= driver.findElement(By.xpath(“button[contain(text(),login)]”));
loginButton.click();
WebElement loggedInText = driver.findElement(By.xpath(“[contains(text(),logged as username’)]”));

If(loggedinText.isDisplayed()){
System.out.println(“Username is visible”);
}
Else{

System.out.println(“Username is not visible”);
}
  WebElement deleteAccountButton = driver.findElement(By.xpath("//button[contains(text(),'Delete Account')]"));
deleteAccountButton.click();

        WebElement accountDeleted = driver.findElement(By.xpath("//*[contains(text(),'ACCOUNT DELETED!')]"));

If(accountDeleted.isDisplayed()){
System.out.println(“Account is deleted is visible”);
}
Else{
System.out.println(“Account deleted is not visible”);
}
Driver.quite();
}}






