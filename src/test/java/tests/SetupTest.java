package tests;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
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
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));
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
}
