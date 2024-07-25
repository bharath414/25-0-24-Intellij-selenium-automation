import org.testng.Assert;
import org.testng.annotations.*;

public class Annotations {
    @BeforeMethod
    void bt1(){
        System.out.println("Before method m1 will be executed");
    }

    @AfterMethod
    void mt1(){
        System.out.println("After method m1 will be executed");
    }
    @Test
    void m1(){
        System.out.println("method m1 will be executed");
    }

    @Test(priority=4,enabled = false)
    void m2(){
        System.out.println("method m2 will be executed");
    }

    @BeforeClass
    void bt2(){
        System.out.println("Before class m1 will be executed");
    }

    @AfterClass
    void mt2(){
        System.out.println("After class m1 will be executed");
    }

    @BeforeTest
    void bt3(){
        System.out.println("Before text m1 will be executed");
    }

    @AfterTest
    void mt3(){
        System.out.println("After Text m1 will be executed");
    }

    @BeforeSuite
    void bt4(){
        System.out.println("Before suite m1 will be executed");
    }

    @AfterSuite
    void mt4(){
        System.out.println("After Suite m1 will be executed");
    }


}
