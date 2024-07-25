import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException, InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();


        //driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

//        driver.findElement(By.id("justAnotherInputBox")).click();
//
//      //List <WebElement> singleDrp = driver.findElements(By.xpath("//div[@id='comboTree99550Wrapper']/descendant::span[@class='comboTreeItemTitle']"));
//      List <WebElement> singleDrp = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//
//        for (WebElement drpValue: singleDrp) {
//            System.out.println(drpValue.getText().trim());
//            if (drpValue.getText().trim().equals("choice 2"))
//                drpValue.click();
//        }


        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();


        WebElement hover = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement hover1 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        Actions actions = new Actions(driver);

        actions
                .moveToElement(hover)
                .moveToElement(hover1)
                .click()
                .perform();
    }

}
