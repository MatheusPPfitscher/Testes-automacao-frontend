package tests;

import PageObjects.*;
import io.qameta.allure.Feature;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

@Feature("Testes site automationPractice")
public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url!");
    }

    @Test
    public void testLogin(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        String emailToLogin = "cwireset2021_matheus@teste.com";
        String passwordToLogin = "cwireset";

        homePage.clickButtonSignIn();
        System.out.println("Click em Sign In e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        loginPage.fillEmail(emailToLogin);
        System.out.println("Preencheu o email");
        loginPage.fillPassword(passwordToLogin);
        System.out.println("Preencheu a senha");

        loginPage.clickButtonSubmitSignIn();
        System.out.println("Click em Sign In");
        assertTrue(loginPage.isInMyAccountPage());
        System.out.println("Validou estar em Minha Conta no site");
    }

    @Test
    public void testRegisterNewAccount(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        CreateAccountPage createAccountPage = new CreateAccountPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        String randomPart = Utils.generateRandomPart();
        System.out.println(randomPart + "@testecwi.com foi gerado para uso neste teste.");
        homePage.clickButtonSignIn();
        loginPage.fillEmailCreateAccount(randomPart + Utils.testData.get("email"));
        loginPage.clickButtonCreateAccount();
        assertTrue(createAccountPage.isInCreateAccountPage());

        createAccountPage.setRadioGender(false);
        createAccountPage.setCustomerFirstName(Utils.testData.get("firstName") + randomPart);
        createAccountPage.setCustomerLastName(Utils.testData.get("lastName") + randomPart);
        createAccountPage.setCustomerPassword(Utils.testData.get("password"));
        createAccountPage.setDateOfBirthDay(Utils.testData.get("dayDateOfBirth"));
        createAccountPage.setDateOfBirthMonth(Utils.testData.get("monthDateOfBirth"));
        createAccountPage.setDateOfBirthYear(Utils.testData.get("yearDateOfBirth"));
        createAccountPage.setAddressCompany(Utils.testData.get("company"));
        createAccountPage.setAddressLine1(Utils.testData.get("addressLine1"));
        createAccountPage.setAddressLine2(Utils.testData.get("addressLine2"));
        createAccountPage.setAddressCity(Utils.testData.get("city"));
        createAccountPage.setAddressState(Utils.testData.get("state"));
        createAccountPage.setAddressZipCode(Utils.testData.get("zipCode"));
        createAccountPage.setAddressCountry(Utils.testData.get("country"));
        createAccountPage.setAdditionalInformation(Utils.testData.get("additionalInformation"));
        createAccountPage.setHomePhone(Utils.testData.get("homePhone"));
        createAccountPage.setMobilePhone(Utils.testData.get("mobilePhone"));
        createAccountPage.setAddressAlias(Utils.testData.get("alias"));

        createAccountPage.clickButtonRegister();
        assertTrue(myAccountPage.isInMyAccountPage());
    }

    @Test
    public void testSearch(){
        String quest = "DRESS";
        String questResultQtd = "7";
        HomePage homePage = new HomePage();
        SearchPage searchPage = new SearchPage();
        homePage.doSearch(quest);
        assertTrue(searchPage.isSearchPage());
        assertEquals(searchPage.getTextLighter(),quest);
        assertThat(searchPage.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    public void testAccessCategoryTShirts(){
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();
        homePage.clickCaregoryTShirts();
        assertTrue(categoryPage.isPageTShirts());
    }

    @Test
    public void testAccessOneProductPageInTShirts(){
        testAccessCategoryTShirts();
        CategoryPage categoryPage = new CategoryPage();
        ProductPage productPage = new ProductPage();

        String nameProductCategory = categoryPage.getProductNameCategory();
        categoryPage.clickProductAddToProductPage();
        assertTrue(productPage.getProductNameOnProductPage().equals(nameProductCategory));
    }

    @Test
    public void testAddProductToCartPage(){
        testAccessOneProductPageInTShirts();

        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        String nameProductOnProductPage = productPage.getProductNameOnProductPage();

        productPage.clickButtonAddToCart();

        productPage.clickButtonModalProceedToCheckout();

        assertTrue(cartPage.getNameProductCart().equals(nameProductOnProductPage));
    }

    @Test
    public void testCreateOrderPayWithBankWireGetConfirmation(){

        testAddProductToCartPage();

        CartPage cartPage = new CartPage();
        cartPage.clickButtonProceedCheckout();

        AuthenticationPage authenticationPage = new AuthenticationPage();
        assertTrue(authenticationPage.isInOrderAuthenticationPage());
        String emailValidAccount = "ldexrhqdow@testecwi.com";
        String passwordValidAccount = "cwireset";
        authenticationPage.fillEmail(emailValidAccount);
        authenticationPage.fillPassword(passwordValidAccount);
        authenticationPage.clickButtonSubmitSignIn();

        AddressesPage addressesPage = new AddressesPage();
        assertTrue(addressesPage.isInAddressesPage());
        addressesPage.clickButtonProceedCheckout();

        ShippingPage shippingPage = new ShippingPage();
        assertTrue(shippingPage.isInShippingPage());
        shippingPage.clickCheckBoxTOS();
        shippingPage.clickButtonProceedCheckout();

        PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
        assertTrue(paymentMethodPage.isInPaymentMethodPage());
        paymentMethodPage.clickBankwireOption();

        BankWirePage bankWirePage = new BankWirePage();
        assertTrue(bankWirePage.isInBankWirePage());
        bankWirePage.clickButtonConfirmOrder();

        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
        assertTrue(orderConfirmationPage.isInOrderConfirmationPage());
    }
}
