package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountElementMapper {

    @FindBy(className = "page-heading")
    public WebElement pageHeading;

    @FindBy(id = "id_gender1")
    public WebElement radioGenderMr;

    @FindBy(id = "id_gender2")
    public WebElement radioGenderMrs;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastName;

    @FindBy(id = "email")
    public WebElement customerEmail;

    @FindBy(id = "passwd")
    public WebElement customerPassword;

    @FindBy(id = "days")
    public WebElement selectDayDateOfBirth;

    @FindBy(id = "months")
    public WebElement selectMonthDateOfBirth;

    @FindBy(id = "years")
    public WebElement selectYearDateOfBirth;

    @FindBy(id = "newsletter")
    public WebElement checkboxNewsletter;

    @FindBy(id = "uniform-optin")
    public WebElement checkboxSpecialOffers;

    @FindBy(id = "firstname")
    public WebElement addressFirstName;

    @FindBy(id = "lastname")
    public WebElement addressLastName;

    @FindBy(id = "company")
    public WebElement addressCompany;

    @FindBy(id = "address1")
    public WebElement addressLine1;

    @FindBy(id = "address2")
    public WebElement addressLine2;

    @FindBy(id = "city")
    public WebElement addressCity;

    @FindBy(id = "id_state")
    public WebElement selectAddressState;

    @FindBy(id = "postcode")
    public WebElement addressZipCode;

    @FindBy(id = "id_country")
    public WebElement selectAddressCountry;

    @FindBy(id = "other")
    public WebElement additionalInformation;

    @FindBy(id = "phone")
    public WebElement homePhone;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement addressAlias;

    @FindBy(id = "submitAccount")
    public WebElement registerAccount;
}
