import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonFifthItemActions extends AmazonFifthItemPage{

    public String get5thTitle() {
        return getTitleOf5thItem().getText();
    }

    public float getPriceOF5thItem() {
        float price = 0;
        String priceText = getPriceItemOf5thItem().getText();
        String finalPrice = priceText.substring(0, 0) + priceText.substring(0+1);
        try {
            NumberFormat nf = NumberFormat.getInstance();
            price = nf.parse(finalPrice).floatValue();
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return price;
    }

    public float calcTotalPriceOf5Items(int quantity)  throws ParseException{
        return getPriceOF5thItem() * quantity;
    }

    public void clickOnQuantityOfItemsToBuy(int quantity){
        getQuantityOfSelectItem().selectByValue(Integer.toString(quantity));
    }

    public void clickOnButtonToAddToCard(){
        getButtonToAddProductOnCard().click();
    }

    public void clickToRefuseExtraOption(){
        getNoThanksButtonFromExtraOption().click();
    }
    public void clickToOpenCart(){
        getCartNotificationItem().click();
    }

    public int getQuantityOfCameras(){
        int quantityValue = Integer.parseInt(getQuantityOfSelectItem().
                getFirstSelectedOption().getText().trim());
        return quantityValue;
    }

    public String getConfirmationTextOfProductAddToCart() {
        return getConfirmationElementOfProductAddedToCart().getText();
    }
}
