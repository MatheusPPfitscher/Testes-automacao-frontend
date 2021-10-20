package PageObjects;

import elementMapper.AddressesPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AddressesPage extends AddressesPageElementMapper {

    public AddressesPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickButtonProceedCheckout(){
        buttonProceedCheckout.click();
    }

    public boolean isInAddressesPage(){return pageHeading.getText().equalsIgnoreCase("Addresses");}
}
