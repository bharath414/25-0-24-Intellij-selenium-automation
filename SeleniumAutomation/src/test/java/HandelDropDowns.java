import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandelDropDowns {

    //https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/ (practice)

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.hdfcbank.com/");

        driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();

        List <WebElement> drpValues =driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));

        System.out.println("Count for dropdown values"+ drpValues.size());

        for (WebElement drpValue: drpValues) {
           // System.out.println(drpValue.getText());

            if (drpValue.getText().equals("Loans"))
            {
                drpValue.click();
            }
        }

    }
}
