import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Instantiate a ChromeDriver class
        WebDriver driver = new EdgeDriver();

        try {
            // Maximize the browser
           // driver.manage().window().maximize();

            // Launch Website
            driver.get("https://www.geeksforgeeks.org/");

            // Optionally add some sleep time to see the opened browser
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}