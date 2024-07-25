import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class Sceenshot {
    public static void main(String[] args) throws IOException, InterruptedException {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);

    File scrFile1 =
            ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    FileUtils.copyFile(scrFile1, new File("C:\\Users\\user\\Desktop\\pr1"));
}
}