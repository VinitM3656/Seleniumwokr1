package PPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;





public class InventryPage {
	
	By select = By.xpath("//selectors[@class='product_sort_container']");
	
	
	By menuBtn= By.xpath("//button[@id='react-burger-menu-btn']");
	By logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	
	WebDriver driver;
	
	public  void InventoryPage(WebDriver d) {
		driver = d;
		
	}
	
	public void changeFilters() {
		
		WebElement dropdown = driver.findElement(select);
		Select sel = new Select(dropdown);
		sel.selectByIndex(2);
	}
	 public void logout() {
		 
		 try {
			 
			 driver.findElement(menuBtn).click();
			 Thread.sleep(3000);
			 
			 driver.findElement(logout).click();
			 
		 } catch(Exception e ) {
			 
			 System.out.println(e.getMessage());
		 }
	 }

}
