import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    // Declaring Static/Global Variable
    static String browser = "chrome"; // You can please have a go using FireFox and Edge Browser.
    // Declaring Static/Global Variable
    static String baseUrl = ("https://courses.ultimateqa.com/users/sign_in");
    // Declaring Static/Global Variable
    static WebDriver driver;

    public static void main(String[] args) {
        // Using if else condition in case user wants to try it on different browser
        // Also including Ignore case method for upper or lower letter input
        if (browser.equalsIgnoreCase("chrome")) {
            // Setting property
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            // Creating object
            driver = new ChromeDriver();
            // Using if else condition if in case user wants to try it on different browser
            // Also including Ignore case method for upper or lower letter input
        } else if (browser.equalsIgnoreCase("edge")) {
            // Setting property
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            // Creating Object
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //Set Property
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            //Create Object
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please enter valid browser name");
        }
        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //Give implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        System.out.println("the Page title is :" + driver.getTitle());

        //Get current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("The Page source is " + driver.getPageSource());

        //Find Username field and enter username
        WebElement enterUser = driver.findElement(By.id("user[email]"));
        enterUser.sendKeys("ultimate@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.id("user[password]"));
        enterPass.sendKeys("ultimate123");

        //Close the browser
        driver.quit();
    }
}
