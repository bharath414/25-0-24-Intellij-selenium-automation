import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

//import.org.webdriver.selenium;
//
public class Assertions {
    public void navigateToUrl(String url, List<WebDriver> drivers) {
        Class<? extends org.openqa.selenium.WebDriver> webDriverClass;
        driver = WebDriverManager.getInstance(webDriverClass).create();
        driver.manage().window().maximize();
        driver.get(url);


System.setProperty("Webdriver.Chrome.driver","C:\Users\user\AppData\Local\Google\Chrome\Application\chrome.exe");
         //driver = new ChromeDriver();
        // driver.get();

//        C:\Users\user\AppData\Local\Google\Chrome\Application}
}
