import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by fernanda on 10/19/17.
 */
public class Connection {
    protected static WebDriver driver;

    public Connection(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        if(driver==null){
            driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            driver.manage().window().maximize();
        }
    }

    public static void close(){
        driver.close();
    }
}
