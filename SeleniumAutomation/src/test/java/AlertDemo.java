import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
//        Thread.sleep(1000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.id("result")).getText());


//        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//        Thread.sleep(1000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.id("result")).getText());
//        Thread.sleep(1000);

//        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//        driver.switchTo().alert().dismiss();
//        System.out.println(driver.findElement(By.id("result")).getText());


        //Click for JS Prompt

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("TestingDemo");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("result")).getText());

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("TestingDemo");
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("result")).getText());

    }
}
