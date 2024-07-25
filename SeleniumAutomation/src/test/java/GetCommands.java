import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class GetCommands {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        getCurrentUrl()
        getTitle()
        getPageSource()
        get()
        getText()
        getAttribute()
         */

        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        System.out.println("Current web page Title   "+ driver.getTitle());
        System.out.println("Current URl "+ driver.getCurrentUrl());
        WebElement sample = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        System.out.println("Page source  "+ driver.getPageSource());
        sample.sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("Current web page Title   "+ driver.getTitle());
        System.out.println("Current URl "+ driver.getCurrentUrl());

        driver.quit();


    }
}
