package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPageElementMapper {

    @FindBy(name = "processAddress")
    public WebElement buttonProceedCheckout;

    @FindBy(className = "page-heading")
    public WebElement pageHeading;
}
