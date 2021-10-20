package PageObjects;

import elementMapper.ShippingPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPage extends ShippingPageElementMapper {

    public ShippingPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickCheckBoxTOS(){
        checkBoxTOS.click();
    }

    public void clickButtonProceedCheckout(){
        buttonProceedCheckout.click();
    }

    public boolean isInShippingPage(){return pageHeading.getText().equalsIgnoreCase("Shipping");}
}
