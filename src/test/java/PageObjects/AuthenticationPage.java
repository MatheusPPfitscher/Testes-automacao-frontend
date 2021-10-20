package PageObjects;

import elementMapper.AuthenticationPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AuthenticationPage extends AuthenticationPageElementMapper {

    public AuthenticationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isInOrderAuthenticationPage(){return pageHeading.getText()
            .equalsIgnoreCase("Authentication");}

    public void fillEmail(String emailLogin){
        email.sendKeys(emailLogin);
    }

    public void fillPassword(String passwordLogin){
        passwd.sendKeys(passwordLogin);
    }

    public void clickButtonSubmitSignIn() {
        buttonSubmitSignIn.click();
    }
}
