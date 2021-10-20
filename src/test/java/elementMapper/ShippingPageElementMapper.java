package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(name = "processCarrier")
    public WebElement buttonProceedCheckout;

    @FindBy(id = "cgv")
    public WebElement checkBoxTOS;
}
