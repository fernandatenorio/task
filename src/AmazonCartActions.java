import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonCartActions extends AmazonCartPage{

    public String getTitleOfItemAddedToCart() {
        return getTitleItemFromCart().getText();
    }

    public float getTotalPrice() {
        float price = 0;
        String priceText = getTotalPriceElement().getText();
        String finalPrice = priceText.substring(0, 0) + priceText.substring(0+1);
        try {
            NumberFormat nf = NumberFormat.getInstance();
            price = nf.parse(finalPrice).floatValue();
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return price;
    }
}
