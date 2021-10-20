package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankwirePageElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(css = "#cart_navigation > button")
    public WebElement buttonConfirmOrder;
}
