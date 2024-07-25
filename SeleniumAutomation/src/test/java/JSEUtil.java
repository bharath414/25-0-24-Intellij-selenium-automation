import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSEUtil {

    public static void refreshTheBrowser (WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    public static void ScrollToViewElement (WebDriver driver,WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public static void ScrollToBottom (WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //js.executeScript("windows.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("window.scroll(0,1000);");
    }

    public static void ScrollToUp (WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //js.executeScript("windows.scrollBy(0,-document.body.scrollHeight)");
        js.executeScript("window.scroll(0,0);");
    }
    public static void drawBorder (WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        //js.executeScript("arguments[0].style.border='3px solid red'", element);
        js.executeScript("arguments[0].style.border='5px dotted green'", element);
    }
    public static void backGroundColour (WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.background='green'", element);
    }

    public static void zoomPage (WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("document.body.style.zoom='150%'", element);
    }

    public static String getTitleByJS (WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title;").toString();
        return title;
    }
    public static void clickJS (WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    public static void JSAlert (WebDriver driver, String message){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("alert('" + message + "')");
    }
}

