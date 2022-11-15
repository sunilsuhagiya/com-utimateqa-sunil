import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        // Declaring String to store sentence
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Most important key and path ensure selecting and copying path/reference click root to copy and paste it for path
        // setting the property for chrome driver
        System.setProperty("webdriver,edge.driver", "driver/msedgedriver.exe");
        // object creation
        WebDriver driver = new EdgeDriver();
        // Launch URL using get method
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // Get the title of the page
        System.out.println("The Page Title is: " + driver.getTitle());
        // Get the Current URL
        System.out.println("The Current URL is:  " + driver.getCurrentUrl());
        // Get page source method
        System.out.println("Printing Page Source:  " + driver.getPageSource());
        // Find the email element and storing it to variable
        WebElement findEmail = driver.findElement(By.id("user[email]"));
        // Entering email field using sendkey method
        findEmail.sendKeys("ultimate@gail.com");
        // Find the Password element and storing it in a variable
        WebElement password = driver.findElement(By.id("user[password]"));
        // Entering Password in password field using send key method
        password.sendKeys("ultimate123");
        // Close the browser
        driver.quit();


    }
}
