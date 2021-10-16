package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {
//    @FindBy(css = ".cat-name")
    @FindBy(className = "cat-name")
    public WebElement nameCategoryTShirts;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreAddToProductPage;
}
