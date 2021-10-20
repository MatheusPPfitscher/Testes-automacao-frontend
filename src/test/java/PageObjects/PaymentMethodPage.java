package PageObjects;

import elementMapper.PaymentMethodPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentMethodPage extends PaymentMethodPageElementMapper {

    public PaymentMethodPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBankwireOption(){
        bankwireOption.click();
    }

    public boolean isInPaymentMethodPage(){return pageHeading.getText()
            .equalsIgnoreCase("Please choose your payment method");}
}
