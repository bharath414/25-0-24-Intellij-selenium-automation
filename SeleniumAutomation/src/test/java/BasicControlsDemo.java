import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicControlsDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

        //First name
        WebElement firstname = driver.findElement(By.id("text1"));
        Thread.sleep(2000);
        if(firstname.isEnabled())
            firstname.sendKeys("FirstName");
        //Last name
        WebElement Lastname = driver.findElement(By.id("text2"));
        if(Lastname.isEnabled())
            firstname.sendKeys("LastName");
        Thread.sleep(2000);

        //check1
        WebElement bikeCheckBox = driver.findElement(By.id("check1"));
        if(bikeCheckBox.isSelected())
            bikeCheckBox.click(); // deselect
        else
            bikeCheckBox.click(); // to select
        Thread.sleep(2000);
        //check2
        WebElement CarCheckBox = driver.findElement(By.id("check2"));
        if(CarCheckBox.isSelected())
            CarCheckBox.click(); // deselect
        else
            CarCheckBox.click(); // to select
        Thread.sleep(1000);
        //to check the boat
        driver.findElement(By.id("check3")).click();
        Thread.sleep(1000);

        //radio2
        driver.findElement(By.id("radio2")).click();

       String path =  System.getProperty("user.dir");
        System.out.println(path);
        driver.findElement(By.name("img")).sendKeys(path+"\\Uploads\\invoce.png");

        WebElement confirmAlert =driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        confirmAlert.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        String actual =driver.findElement(By.xpath("//div[text()='You pressed OK!']")).getText();

        if (actual.equals("You pressed OK!"))
            System.out.println("success");

    }

}
