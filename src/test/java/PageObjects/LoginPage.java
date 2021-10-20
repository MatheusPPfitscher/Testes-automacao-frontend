package PageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(String emailLogin){
        email.sendKeys(emailLogin);
    }

    public void fillPassword(String passwordLogin){
        passwd.sendKeys(passwordLogin);
    }

    public void fillEmailCreateAccount(String emailToCreateAccount){
        formEmailCreateAccount.sendKeys(emailToCreateAccount);
    }

    public void clickButtonCreateAccount() {buttonSubmitCreateAccount.click();}

    public void clickButtonSubmitSignIn() {
        buttonSubmitSignIn.click();
    }

    public boolean isInMyAccountPage() {
        return pageHeading.getText().equalsIgnoreCase("My account");
    }

}
