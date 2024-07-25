import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {
    // WebDriver driver;
   // String path ="C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";

    public static void main(String[] args) {


  System.setProperty("Webdriver." +
          "chromedriver.driver","C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//    driver = new ChromeDriver();
   // WebDriverManager.chromedriver().setup();
    webdriver driver =new EdgeDriver();
    driver.manage().window().maximize();

        driver.get("https://www.orangehrm.com/");
    }
    @Test
    void sample(){
    System.out.println("assertions done");
    }
//    @AfterClass
//    Void teardown() {
//        driver.quit();
//      //  return asser();
//        return null;
 //   }
}
