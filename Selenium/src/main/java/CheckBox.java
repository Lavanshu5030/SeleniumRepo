import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();

        // Instantiate a ChromeDriver class
        WebDriver driver = new EdgeDriver();


        try {
            // Maximize the browser
           // driver.manage().window().maximize();

            // Launch Website
            driver.get("http://demo.guru99.com/test/radio.html");
            
            WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
            radio1.click();
            System.out.println("Radio Button Option 1 Selected");


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
