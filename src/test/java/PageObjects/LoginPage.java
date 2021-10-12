package PageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("cwireset2021_matheus@teste.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("cwireset");

    }

    public void clickBtnSubmitLogin() {
        SubmitLogin.click();
    }
}
