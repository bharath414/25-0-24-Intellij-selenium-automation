import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BootstarpDropDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.makemytrip.com/");

        File mainScrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File storePath1 = new File("./uploads/img1.png");
        FileUtils.copyFile(mainScrFile1,storePath1);
        System.out.println("First Screenshot is saved");

        driver.findElement(By.xpath("//input[@id='fromCity']")).click();

        WebElement textBox =  driver.findElement(By.xpath("//div[@role='combobox']/input"));
        textBox.sendKeys("Mumbai");
        Thread.sleep(2000);
        textBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        textBox.sendKeys(Keys.ENTER);

        File mainScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File storePath = new File("./uploads/img2.png");
        FileUtils.copyFile(mainScrFile,storePath);
        System.out.println("Screenshot is saved");

    }
}
