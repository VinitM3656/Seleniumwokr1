package Practice99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.seleniumhq.jetty9.util.Scanner;
//import com.atlascopco.stl.SpellChecker;
import org.openqa.selenium.internal.Require.StateChecker;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Spellingmistake {

    public static void main(String[] args) {
        // Setup ChromeDriver
     //   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // URL of the website to check
        String url = "https://www.ezworks.ai/";
        driver.get(url);

        // Extract text from the webpage
      //  List<WebElement> elements = driver.findElements(By.xpath("//*[not(self::script or self::style)]//text()"));
        StringBuilder textContent = new StringBuilder();
        for (WebElement element : element) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                textContent.append(text).append(" ");
            }
        }

        // Close the WebDriver
        driver.quit();

        // Split text into words
        String[] words = textContent.toString().split("\\s+");

        // Initialize the spell checker
        StateChecker spellChecker = new StateChecker();

        // Find misspelled words
        Set<String> misspelledWords = new HashSet<>();
        for (String word : words) {
            if (!spellChecker.isCorrect(word)) {
                misspelledWords.add(word);
            }
        }

        // Print out the misspelled words
        System.out.println("Misspelled words:");
        for (String word : misspelledWords) {
            System.out.println(word);
        }
    }
}
