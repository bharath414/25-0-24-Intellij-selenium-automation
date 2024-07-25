import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandel {

    public static void main(String[] args) {
        newWindowDemo();
    }

    static public void newTabDemo()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://theautomationzone.blogspot.com/#");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window"+ parentWindow);
        driver.findElement(By.id("tabButton")).click();

        System.out.println("==============================================");

        Set<String> windowHandles = driver.getWindowHandles();
        for (String  windowHandle :windowHandles) {
            //System.out.println(windowHandle);
            if (!parentWindow.equals(windowHandle))
            {
                driver.switchTo().window(windowHandle);
                driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
            }
        }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("windowButton")).click();
    }

    static public void newWindowDemo()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://theautomationzone.blogspot.com/#");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window"+ parentWindow);
        driver.findElement(By.id("windowButton")).click();

        System.out.println("==============================================");

        Set<String> windowHandles = driver.getWindowHandles();
        for (String  windowHandle :windowHandles) {
            //System.out.println(windowHandle);
            if (!parentWindow.equals(windowHandle))
            {
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
                driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
            }
        }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("tabButton")).click();
    }
}
