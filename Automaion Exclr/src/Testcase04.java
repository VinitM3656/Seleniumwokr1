import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrom.ChromeDriver;

Public static void main(String[]args){
System.setProperty(“"webdriver.chrome.driver", "E:/loopsautomation/src/main/resources/chromedriver.exe");

WebDriver driver = new ChromeDriver();
Driver.get(http://automationexcercise.com);

WebElement homePageElement = driver.findElement(By.xpath("//*[text()='Home Page Element']"));
If(homePageElement.isDisplayed()){
System.out.println(“Home page is visible”);
}
Else
{
System.out.println(“Home page is not visible”);
}
WebElement signupLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Signup / Login')]"));
signupLoginButton.click();

WebElement loginToAccount = driver.findElement(By.xpath(“*[contain(text(),’Login to your account’)]”));
If (loginToAccount.isDisplayed()){

System.out.println(“Login to your account is visible”);
}
Else{
System.out.println(“Login to your account is not visible”);
}
WebElement emailField = driver.findElement(Vinitbmhetre@gmail.com);
emailField.sendkeys(“Vinitbmhetre@gmail.com”);

WebElement passwordField = driver.findElement(By.id(“Rohit@345”));
passwordField.sendkeys(“Rohit@345”);
 WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();
        WebElement loggedInText = driver.findElement(By.xpath("//*[contains(text(),'Logged in as username')]"));
        if (loggedInText.isDisplayed()) {
            System.out.println("'Logged in as username' is visible");
        } else {
            System.out.println("'Logged in as username' is not visible");
        }
        WebElement logoutButton = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
        logoutButton.click();
        WebElement loginPage = driver.findElement(By.xpath("//*[contains(text(),'Login to your account')]"));
        if (loginPage.isDisplayed()) {
            System.out.println("User is navigated to login page after logout");
        } else {
            System.out.println("User is not navigated to login page after logout");
        }        driver.quit();
    }
}

