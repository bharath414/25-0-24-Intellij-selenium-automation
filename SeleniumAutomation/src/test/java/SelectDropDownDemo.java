import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDownDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

        WebElement dropdown = driver.findElement(By.id("Carlist"));
        Select firstDropdown = new Select(dropdown);
        List<WebElement> Alloptions =firstDropdown.getOptions();

        for (WebElement Alloption : Alloptions ) {

            System.out.println(Alloption.getText());
        }
        System.out.println(firstDropdown.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        firstDropdown.selectByVisibleText("BMW");
        Thread.sleep(1000);
        firstDropdown.selectByValue("Audi Car");
        Thread.sleep(1000);
        firstDropdown.selectByIndex(4); //Toyota
        Thread.sleep(1000);
        System.out.println("At last"+ firstDropdown.getFirstSelectedOption().getText());
//
//
//        WebElement Multidropdown = driver.findElement(By.name("FromLB"));
//        Select firstDropdown = new Select(Multidropdown);
//        List<WebElement> Alloptions =firstDropdown.getOptions();
//
//        for (WebElement Alloption : Alloptions ) {
//
//            System.out.println(Alloption.getText());
//        }
//
//        System.out.println("-----------------------------------------------------");
//        Thread.sleep(1000);
//        firstDropdown.selectByVisibleText("USA");
//        Thread.sleep(1000);
//        firstDropdown.selectByVisibleText("Russia");
//        Thread.sleep(1000);
//        firstDropdown.selectByValue("Mexico");
//        Thread.sleep(1000);
//        firstDropdown.selectByValue("Germany");
//        Thread.sleep(1000);
//        firstDropdown.selectByIndex(5); //India
//        Thread.sleep(1000);
//        firstDropdown.deselectByIndex(5);//India
//        Thread.sleep(1000);
//        firstDropdown.deselectByValue("Mexico");
//        Thread.sleep(2000);
//
//        System.out.println("-----------------------------------------------------");
//        System.out.println("Selected options");
//
//        List<WebElement> selectedValues =firstDropdown.getAllSelectedOptions();
//
//        for (WebElement selectedValue : selectedValues ) {
//
//            System.out.println(selectedValue.getText());
//        }
//        //System.out.println("At last"+ firstDropdown.getFirstSelectedOption().getText());
//
//    }
}
