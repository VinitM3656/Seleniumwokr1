import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {

	public static void main(String[] args) {
		try {
			 WebDriver driver = new ChromeDriver();
			//ChromeDriver driver = new ChromeDriver();
			Thread.sleep (5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://www.amazon.in/ap/signin/ref=cart_empty_sign_in?openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fcart%3Fapp-nav-type%3Dnone%26dc%3Ddf&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			Thread.sleep(2000);

            WebElement emailInput = driver.findElement(By.id("ap_email"));
            emailInput.sendKeys("mhetrevinit@gmail.com");
			Thread.sleep(5000);
			driver.manage().window().minimize();
			
			driver.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
			
			}
		
			

	}

}
