import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesDemo {
    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        driver.get("https://demo.automationtesting.in/Frames.html");
//       System.out.println(driver.findElements(By.tagName("iframe")).size());
        Iframes();
      //  NestedFrames();
    }

 static public void NestedFrames() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click(); // main doc

        WebElement ParentFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(ParentFrame);//parent
        Thread.sleep(1000);
        WebElement ChildFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(ChildFrame);// child
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IframeDemo");
        Thread.sleep(1000);
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("//a[text()='Home']")).click();

    }

    static public void Iframes() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("singleframe");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IframeDemo");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
      //  driver.findElement(By.xpath("//a[text()='Home']")).click();
    }
}

