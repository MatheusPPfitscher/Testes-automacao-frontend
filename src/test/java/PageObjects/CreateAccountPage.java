package PageObjects;

import elementMapper.CreateAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class CreateAccountPage extends CreateAccountElementMapper {

    public CreateAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public boolean isInCreateAccountPage() {
        WebDriverWait wait = new WebDriverWait(Browser.getCurrentDriver(),10);
        wait.until(ExpectedConditions.urlContains("#account-creation"));
        return (pageHeading.getText()
                .equalsIgnoreCase("Create an account"));
    }

    public void setRadioGender(boolean mrMrs){
        if (mrMrs) radioGenderMrs.click();
        else radioGenderMr.click();
    }

    public void setCustomerFirstName(String firstName){
        customerFirstName.sendKeys(firstName);
    }

    public void setCustomerLastName(String lastName){
        customerLastName.sendKeys(lastName);
    }

    public void setCustomerEmail(String email){
        customerEmail.sendKeys(email);
    }

    public void setCustomerPassword(String password) {
        customerPassword.sendKeys(password);
    }

    public void setDateOfBirthDay(String day){
        Select selectDay = new Select(selectDayDateOfBirth);
        selectDay.selectByValue(day);
    }

    public void setDateOfBirthMonth(String month){
        Select selectMonth = new Select(selectMonthDateOfBirth);
        selectMonth.selectByValue(month);
    }

    public void setDateOfBirthYear(String year){
        Select selectYear = new Select(selectYearDateOfBirth);
        selectYear.selectByValue(year);
    }

    public void setAddressFirstName(String firstName){
        addressFirstName.sendKeys(firstName);
    }

    public void setAddressLastName(String lastName){
        addressLastName.sendKeys(lastName);
    }

    public void setAddressCompany(String company){
        addressCompany.sendKeys(company);
    }

    public void setAddressLine1(String line1){
        addressLine1.sendKeys(line1);
    }

    public void setAddressLine2(String line2){
        addressLine2.sendKeys(line2);
    }

    public void setAddressCity(String city){
        addressCity.sendKeys(city);
    }

    public void setAddressState(String state){
        Select selectState = new Select(selectAddressState);
        selectState.selectByVisibleText(state);
    }

    public void setAddressZipCode(String zipCode){
        addressZipCode.sendKeys(zipCode);
    }

    public void setAddressCountry(String country){
        Select selectCountry = new Select(selectAddressCountry);
        selectCountry.selectByVisibleText(country);
    }

    public void setAdditionalInformation(String information){
        additionalInformation.sendKeys(information);
    }

    public void setHomePhone(String phone){
        homePhone.sendKeys(phone);
    }

    public void setMobilePhone(String phone){
        mobilePhone.sendKeys(phone);
    }

    public void setAddressAlias(String alias){
        addressAlias.sendKeys(alias);
    }

    public void clickButtonRegister(){
        registerAccount.click();
    }
}
