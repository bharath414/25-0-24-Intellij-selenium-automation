import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getverifytitle {
    //public class TC002_Verify {
        //Test Data
//DT Var VV
        static String url = "http://183.82.103.245/nareshit/login.php&quot";
        static String username = "nareshit";
        static String password = "nareshit";
        static String title1 = "OrangeHRM - New Level of HR Management";
        static String title2 = "OrangeHRM";
        public static void main(String args[]) throws Exception{
            //Test Steps
            WebDriver driver = new ChromeDriver();
            driver.navigate().to(url);
            System.out.println("Application Opened");
            Thread.sleep(3000);
//Verify Title
// Actual Title compare Expected Title
            if(driver.getTitle().equals(title1)) {
                System.out.println("Title Matched");
            }
            else {
                System.out.println("Title not matched");
                System.out.println(driver.getTitle());
            }
//hard-coded:
//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
//Variable:
            driver.findElement(By.name("txtUserName")).sendKeys(username);
            driver.findElement(By.name("txtPassword")).sendKeys(password);
            Thread.sleep(3000);
            driver.findElement(By.name("Submit")).click();
            Thread.sleep(3000);
            System.out.println("Login completed");
//Verify Title
            if(driver.getTitle().equals(title2)) {
                System.out.println("Title matched");
            }
            else {
                System.out.println("Title not matched");
                System.out.println(driver.getTitle());
            }
//mouseover
            Actions ac = new Actions(driver);
            ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
            System.out.println("mouseover completed");
            Thread.sleep(4000);
            driver.findElement(By.linkText("Add Employee")).click();
            System.out.println("Clicked on addemp submenu");
            Thread.sleep(4000);
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
            System.out.println("Logout completed");
            System.out.println("Testing is Exellent");
            driver.close();

        }
    }


