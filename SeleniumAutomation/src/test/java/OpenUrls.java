import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenUrls {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys("TestDemo");
        driver.findElement(By.id("lastName")).sendKeys("TestLast");
        driver.findElement(By.id("email")).sendKeys("demo@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Test@123");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        driver.quit();

//        String driverstr = "Firefox" ;
//
//        WebDriver driver;
//
//        if(driverstr.equals("chrome")){
//
//             driver = new ChromeDriver();
//
//        } else if (driverstr.equals("Firefox")) {
//
//             driver = new FirefoxDriver();
//        }
//        else {
//             driver = new SafariDriver();
//        }


    }
}
