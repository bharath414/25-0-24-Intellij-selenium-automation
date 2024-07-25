import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*
moveToElement : hover
contextClick : Right click
dragAndDrop
doubleClick

https://the-internet.herokuapp.com/context_menu
https://the-internet.herokuapp.com/hovers
https://jqueryui.com/droppable/
https://only-testing-blog.blogspot.com/
*/

public class DemoActions {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions action = new Actions(driver);

        WebElement right =driver.findElement(By.xpath("//div[@id='hot-spot']"));

        action.moveToElement(right).contextClick().perform();
        driver.switchTo().alert().accept();

    }
}
