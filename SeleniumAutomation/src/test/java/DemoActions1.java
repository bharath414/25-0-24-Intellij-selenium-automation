import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions1 {

    public static void main(String[] args) {
     //   WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/hovers");

        WebElement hover =driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]"));
        WebElement viewProfile =driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]"));

        Actions action = new Actions(driver);

        action.moveToElement(hover).moveToElement(viewProfile).click().perform();

//        action
//                .moveToElement(hover)
//                .moveToElement(viewProfile)
//                .click()
//                .perform();

    }
}
