package tests;

import PageObjects.*;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUril()));
        System.out.println("Abrimos o navegador e carregamos a url!");
    }

    @Test
    public void testLogin(){
        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Click em Sign In e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUril().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Click em Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUril().concat("index.php?controller=my-account")));
        System.out.println("Validou a url de minha conta");
        assertTrue(login.isInMyAccountPage());
        System.out.println("Validou Minha Conta no site");
    }
    @Test
    public void testSearch(){
        String quest = "DRESS";
        String questResultQtd = "7";
        //iniciar páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();
        home.doSearch(quest);
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter(),quest);
//        assertEquals(search.getTextHeading_counter(),"7 results have been found");
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    public void testAccessCategoryTShirts(){
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();
        home.clickCaregoryTShirts();
        assertTrue(category.isPageTShirts());
    }

    @Test
    public void testAccessOneProductPageInTShirts(){
        testAccessCategoryTShirts();
        CategoryPage category = new CategoryPage();
        ProductPage productPage = new ProductPage();

        String nameProductCategory = category.getProductNameCategory();
        category.clickProductAddToProductPage();
        assertTrue(productPage.getProductNameOnProductPage().equals(nameProductCategory));
    }

    @Test
    public void testAddProductToCartPage(){
        testAccessOneProductPageInTShirts();

        ProductPage productPage = new ProductPage();
        CartPage cart = new CartPage();

        String nameProductOnProductPage = productPage.getProductNameOnProductPage();

        productPage.clickButtonAddToCart();

        productPage.clickButtonModalProceedToCheckout();

        assertTrue(cart.getNameProductCart().equals(nameProductOnProductPage));
    }
}
