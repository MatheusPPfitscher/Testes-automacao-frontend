package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;
}
