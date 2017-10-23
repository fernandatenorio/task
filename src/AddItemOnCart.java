import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;

/**
 * Created by fernanda on 10/19/17.
 */

public class AddItemOnCart extends Connection{
    private static AmazonHomePageActions amazonHomePageActions;
    private static AmazonFifthItemActions amazonFifthItemActions;
    private static AmazonCartActions amazonCartActions;
    private static AmazonCamDigitalBestSellersActions amazonCamDigitalBestSellersActions;

    @BeforeClass
    public static void setup(){
        amazonHomePageActions = new AmazonHomePageActions();
        amazonFifthItemActions = new AmazonFifthItemActions();
        amazonCartActions = new AmazonCartActions();
        amazonCamDigitalBestSellersActions = new AmazonCamDigitalBestSellersActions();

    }

    @Test
    public void itShouldAddCamerasOnCart() {
        int quantity = 8;
        String productTitle = "";
        float totalPrice = 1;

        amazonHomePageActions.clickOnDigitalCamerasBestSellers();
        Assert.assertEquals(amazonCamDigitalBestSellersActions.getTitleOfPage(),
                "Best Sellers in Digital Cameras");

        amazonCamDigitalBestSellersActions.
                clickOn5thItemIntoDigitalCamerasBestSellers();
        Assert.assertTrue(!amazonFifthItemActions.get5thTitle().isEmpty());
        productTitle = amazonFifthItemActions.get5thTitle();
        try {
            totalPrice = amazonFifthItemActions.calcTotalPriceOf5Items(quantity);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        amazonFifthItemActions.clickOnQuantityOfItemsToBuy(quantity);
        Assert.assertEquals(amazonFifthItemActions.getQuantityOfCameras(), quantity);

        amazonFifthItemActions.clickOnButtonToAddToCard();
        amazonFifthItemActions.clickToRefuseExtraOption();
        Assert.assertEquals(amazonFifthItemActions.
                getConfirmationTextOfProductAddToCart(), "Added to Cart");

        amazonFifthItemActions.clickToOpenCart();
        Assert.assertEquals(productTitle,
                amazonCartActions.getTitleOfItemAddedToCart());
        Assert.assertTrue(totalPrice == amazonCartActions.getTotalPrice());

    }

    @AfterClass
    public static void tearDown() {
        close();
    }
}
