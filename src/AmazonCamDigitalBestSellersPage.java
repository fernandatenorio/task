import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonCamDigitalBestSellersPage extends Connection{
    WebDriverWait wait;

    public AmazonCamDigitalBestSellersPage() {
        wait = new WebDriverWait(driver, 10);
    }

    public WebElement get5thItemIntoDigitalCamerasBestSellers() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("zg_centerListWrapper")));
        return driver.findElement(By.id("zg_centerListWrapper")).
                findElements(By.xpath("*")).get(5)
                .findElements(By.tagName("div")).get(1).findElement(
                        By.tagName("a"));
    }

    public WebElement getTitleItemOfPage(){
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.id("zg_listTitle"))));
        return driver.findElement(By.id("zg_listTitle"));
    }
}
