package elementMapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(className = "login")
    public WebElement login;

//    @FindBy(id = "search_query_top") //Selenium webdriver consegue mapear IDs e names automaticamente
    public WebElement search_query_top;
//    A performance pode ser melhorada ao usar CSS Selectors
    @FindBy(css = "button.btn.btn-default.button-search")
    public WebElement submit_search;
}
