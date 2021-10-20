package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    public WebElement email;

    public WebElement passwd;

    @FindBy(id = "SubmitLogin")
    public WebElement buttonSubmitSignIn;

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(id = "email_create")
    public WebElement formEmailCreateAccount;

    @FindBy(id = "SubmitCreate")
    public WebElement buttonSubmitCreateAccount;
}
