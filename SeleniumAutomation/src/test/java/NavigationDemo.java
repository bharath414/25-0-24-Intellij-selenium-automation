import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Amazon", Keys.ENTER);

        driver.navigate().to("https://only-testing-blog.blogspot.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("testDemo");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

       // driver.quit();
    }

}
