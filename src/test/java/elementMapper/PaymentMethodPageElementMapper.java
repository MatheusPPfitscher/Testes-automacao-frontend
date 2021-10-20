package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPageElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(className = "bankwire")
    public WebElement bankwireOption;
}
