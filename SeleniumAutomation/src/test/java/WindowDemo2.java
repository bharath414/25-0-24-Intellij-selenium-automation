import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowDemo2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentWindow = driver.getWindowHandle();

        System.out.println("Parent Window  "+ parentWindow);
        driver.findElement(By.id("newTabsWindowsBtn")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String  windowHandle :windowHandles) {
            System.out.println(windowHandle);
        }
    }
}
