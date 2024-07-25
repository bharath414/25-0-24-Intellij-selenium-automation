import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("https://jqueryui.com/droppable/");
        driver.get("https://only-testing-blog.blogspot.com/");

//        WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//        driverhttps://demo.opencart.com/
//       WebElement a = driver.findElement(By.id("draggable"));
//       WebElement b = driver.findElement(By.id("droppable"));
//
//        Actions action = new Actions(driver);
//        action.
//                dragAndDrop(a,b)
//                .perform();

       // WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='gparent_1']"));

        Actions action = new Actions(driver);
        searchBox.sendKeys("TestDemo");
        Thread.sleep(2000);
        action.
                moveToElement(searchBox)
                .click()
                .doubleClick()
                .perform();
    }

}
