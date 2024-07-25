import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //To open in new TAB
//        driver.navigate().to("https://only-testing-blog.blogspot.com/");
//        Thread.sleep(2000);
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fjoin");
//        Thread.sleep(2000);
//        driver.quit();

        //To open in new Window
        driver.navigate().to("https://only-testing-blog.blogspot.com/");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fjoin");
        Thread.sleep(2000);
        driver.quit();

    }
}
