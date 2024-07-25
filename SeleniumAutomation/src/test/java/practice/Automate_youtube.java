package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_youtube {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.youtube.com/");
        WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
        ele.sendKeys("postman");
    }
}