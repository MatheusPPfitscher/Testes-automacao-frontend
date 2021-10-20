package PageObjects;

import elementMapper.BankwirePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class BankWirePage extends BankwirePageElementMapper {

    public BankWirePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickButtonConfirmOrder(){
        buttonConfirmOrder.click();
    }

    public boolean isInBankWirePage(){return pageHeading.getText().trim().equalsIgnoreCase("Order summary");}
}
