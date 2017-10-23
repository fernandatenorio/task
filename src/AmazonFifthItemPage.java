import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonFifthItemPage extends Connection{
    WebDriverWait wait;

    public AmazonFifthItemPage() {
        wait = new WebDriverWait(driver, 10);
    }


    public WebElement getTitleOf5thItem(){
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("productTitle")));
        return driver.findElement(By.id("productTitle"));
    }

    public WebElement getPriceItemOf5thItem(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.id("priceblock_ourprice"))));
        return driver.findElement(By.id("priceblock_ourprice"));
    }

    public Select getQuantityOfSelectItem(){
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.id("quantity"))));
        Select dropdown = new Select(driver.findElement(By.id("quantity")));
        return dropdown;
    }

    public WebElement getButtonToAddProductOnCard(){
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.id("add-to-cart-button"))));
        return driver.findElement(By.id("add-to-cart-button"));
    }

    public WebElement getNoThanksButtonFromExtraOption(){
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("siNoCoverage-announce")));
        return driver.findElement(By.id("siNoCoverage-announce"));
    }

    public WebElement getCartNotificationItem(){
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.id("nav-cart"))));
        return driver.findElement(By.id("nav-cart"));
    }

    public WebElement getConfirmationElementOfProductAddedToCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.id("huc-v2-order-row-confirm-text"))));
        return driver.findElement(
                By.id("huc-v2-order-row-confirm-text")).findElement(
                        By.tagName("h1"));
    }

}
