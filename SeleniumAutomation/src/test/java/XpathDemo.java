import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String ExpectedText = " Username or email address ";
        driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fjoin");

        String ActualText =driver.findElement(By.xpath("//label[@for='login_field']")).getText();

        if (ActualText.equals(ExpectedText.trim()))
        {
            System.out.println("Strings are matched");
        }
        else
            System.out.println("Strings are not matched");

        driver.close();
    }
}
