package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBase {
    protected WebDriver driver;
    public void startChromeBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
         driver = new ChromeDriver(options);
        driver.get(url);
    }
    public void closeChromeBrowser()
    {
        driver.close();
    }
}
