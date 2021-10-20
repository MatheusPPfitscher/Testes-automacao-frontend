package PageObjects;

import elementMapper.OrderConfirmationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class OrderConfirmationPage extends OrderConfirmationPageElementMapper {

    public OrderConfirmationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public boolean isInOrderConfirmationPage(){
        return pageHeading.getText().equalsIgnoreCase("Order confirmation");
    }
}
