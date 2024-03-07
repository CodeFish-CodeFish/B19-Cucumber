package com.automation_exercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SignUpPage {

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#id_gender1")
    WebElement mrRadioBtn;

    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#email")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#days")
    WebElement daysDropdown;

    @FindBy(css = "#months")
    WebElement monthDropdown;

    @FindBy(css = "#years")
    WebElement yearsDropdown;

    @FindBy(css = "#first_name")
    WebElement firstName;

    @FindBy(css = "#last_name")
    WebElement lastName;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#country")
    WebElement countryDropdown;// Singapore

    @FindBy(css = "#state")
    WebElement state;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#zipcode")
    WebElement zipCode;

    @FindBy(css = "#mobile_number")
    WebElement phone;

    @FindBy(xpath = "//button[.='Create Account']")
    WebElement createBtn;

    public void checkMrValidateName(String name){
        this.mrRadioBtn.click();
        String actualName = this.name.getAttribute("value");
        Assert.assertEquals("Failed to validate entered name",name, actualName);
    }

    public void validateEmailEnterPassword(String password){
        Assert.assertFalse(this.email.isEnabled());
        this.password.sendKeys(password);
    }

    public void enterBirthdate(String day, String month, String year){
        BrowserUtils.selectBy(this.daysDropdown, day, "visibleText");
        BrowserUtils.selectBy(this.monthDropdown, month, "visibleText");
        BrowserUtils.selectBy(this.yearsDropdown, year, "visibleText");
    }

    public void firstNameLnameAddress(String firstName, String lastName, String address){

        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.address.sendKeys(address);

    }

    public void enterCountryStateCity(String country, String state, String city){

        BrowserUtils.selectBy(countryDropdown, country, "visibleText");
        this.state.sendKeys(state);
        this.city.sendKeys(city);

    }

    public void zipCodePhoneAndCreate(String zipCode, String phoneNumber){
        this.zipCode.sendKeys(zipCode);
        this.phone.sendKeys(phoneNumber);
        this.createBtn.click();
    }












}
