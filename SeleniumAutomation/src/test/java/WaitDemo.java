import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        //driver.get("https://theautomationzone.blogspot.com/");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

//        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
//        System.out.println(driver.findElement(By.id("message1")).getText());

//        driver.findElement(By.xpath("//button[text()='Remove']")).click();
//        //Thread.sleep(5000);
//        //driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        driver.findElement(By.xpath("//button[text()='Add']")).click();
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

//        driver.findElement(By.xpath("//button[text()='Enable']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//        driver.findElement(By.xpath("//input[@type='text']")).click();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo");

        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        Wait waitt = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Demo");

    }
}
