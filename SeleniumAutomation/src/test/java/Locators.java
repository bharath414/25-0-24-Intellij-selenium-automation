import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stackoverflow.com/users/login");

        // driver.findElement(By.id("email")).sendKeys("uthejkumar.atp@gmail.com");
         driver.findElement(By.cssSelector("input#email")).sendKeys("uthejkumar.atp@gmail.com");
        //EmailTextBox.sendKeys("uthejkumar.atp@gmail.com");

        driver.findElement(By.name("password")).sendKeys("Passw0rd");
        Thread.sleep(2000);
        driver.findElement(By.id("submit-button")).click();
        Thread.sleep(2000);

        List<WebElement> urls = driver.findElements(By.xpath("//p"));

        System.out.println("Number of Urls " + urls.size());

        for (WebElement url : urls)
        {
            System.out.println(url.getText());
        }

        WebElement search =driver.findElement(By.cssSelector("input[role=\"combobox\"]"));
        search.sendKeys("selenium");
        Thread.sleep(1000);
        search.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("svg[class=\"svg-icon iconStackExchange\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a.js-gps-track[href=\"https://stackoverflow.com/users/logout\"]")).click();

        driver.findElement(By.partialLinkText("exchange")).click();
    }

    }

