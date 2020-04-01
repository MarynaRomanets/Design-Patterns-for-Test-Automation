import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverSingleton {

    private static WebDriver driver;

    public WebDriverSingleton() {
    }

    public static WebDriver getWebDriverInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
            //DesiredCapabilities capabilities = new DesiredCapabilities.chrome();
            //driver = new ChromeDriver(capabilities);
        }
        return driver;
    }
}
