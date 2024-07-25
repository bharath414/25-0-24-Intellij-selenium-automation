import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.example.Main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JsDemo {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.w3schools.com/cssref/pr_border-style.php");

        WebElement relationship= driver.findElement(By.xpath("//div[@id='belowtopnav']//div[@id='main']//div[2]//a[1][1]//span[1]"));

        // Click
        //JSEUtil.clickJS(relationship,driver);

        // JS Alert
        //JSEUtil.JSAlert(driver,"its a demo");


        //Get titles
//        System.out.println(JSEUtil.getTitleByJS(driver));
//        System.out.println("Inbuilt function " +driver.getTitle()) ;


        // Highlight and border with screenshot
//        WebElement textBox = driver.findElement(By.xpath("//input[@id='gparent_1']"));
//        js.executeScript("arguments[0].style.border='3px dashed red'", textBox);

//        File mainScrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File storePath1 = new File("./uploads/img3.png");
//        FileUtils.copyFile(mainScrFile1,storePath1);
//        System.out.println("First Screenshot is saved");

//        JSEUtil.backGroundColour(relationship,driver);

        //refresh the browser
       // JSEUtil.refreshTheBrowser(driver);

        // Scroll to view elemnt
//        WebElement toView = driver.findElement(By.xpath("//h3[normalize-space()='Tooltip Example']"));
//        Thread.sleep(2000);
//        JSEUtil.ScrollToViewElement(driver,toView);

        //Scroll to bottom
        JSEUtil.ScrollToBottom(driver);

        Thread.sleep(2000);
        //Scroll Up
        JSEUtil.ScrollToUp(driver);

        JSEUtil.zoomPage(relationship,driver);

        Thread.sleep(5000);
       // driver.quit();


    }
}
