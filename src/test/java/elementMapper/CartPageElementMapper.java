package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMapper {

    @FindBy(css = "#cart_summary .product-name")
    public WebElement productNameCart;

    @FindBy(css = "a:not([rel])[title='Proceed to checkout']")
    public WebElement buttonProceedCheckout;
}
