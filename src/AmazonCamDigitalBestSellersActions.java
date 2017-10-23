/**
 * Created by fernanda on 10/19/17.
 */
public class AmazonCamDigitalBestSellersActions extends AmazonCamDigitalBestSellersPage{
    public void clickOn5thItemIntoDigitalCamerasBestSellers(){
        get5thItemIntoDigitalCamerasBestSellers().click();
    }

    public String getTitleOfPage() {
        return getTitleItemOfPage().getText();
    }
}
