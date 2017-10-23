import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonCartPage extends Connection {
    WebDriverWait wait;

    public AmazonCartPage() {
        wait = new WebDriverWait(driver, 10);
    }
    public WebElement getTitleItemFromCart() {
        wait.until(ExpectedConditions.elementToBeClickable(By.
                className("sc-list-item-content")));
        return driver.findElement(By.className("sc-list-item-content")).
                findElement(By.className("sc-product-title"));
    }

    public WebElement getTotalPriceElement() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.className("sc-price"))));
        return driver.findElement(By.className("sc-price"));
    }
}
