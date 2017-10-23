import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonHomePage extends Connection{
    WebDriverWait wait;

    public AmazonHomePage() {
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement getDigitalCamerasBestSellersItem(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.xpath("//*[contains(text(), 'Digital Cameras best sellers')]"))));
        /*
        Although this element has a id, I couldn't use it to the test, because
        it is dynamic. It started the test development as desktop-2, but after
        it became desktop-3, so for this reason I am using the approach to click
        on See more to open cameras section.
        */
        return driver.findElements(By.linkText("See more")).get(1);
    }
}
