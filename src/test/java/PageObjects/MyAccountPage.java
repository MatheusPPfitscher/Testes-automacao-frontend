package PageObjects;

import elementMapper.MyAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class MyAccountPage extends MyAccountPageElementMapper {

    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isInMyAccountPage() {
        WebDriverWait wait = new WebDriverWait(Browser.getCurrentDriver(),10);
        wait.until(ExpectedConditions.urlContains("my-account"));
        return (pageHeading.getText().equalsIgnoreCase("MY ACCOUNT"));
    }
}
