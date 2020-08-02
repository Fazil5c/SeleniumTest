import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            WebDriver driver = new ChromeDriver(options);
            driver.get("http://google.com");
    }
}
