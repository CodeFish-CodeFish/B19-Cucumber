package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class FormDemoPage {

    public FormDemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /*
    1. Navigate to lambda main page and click on Input Form Submit
    2. Fill in all the information using DataTable format
    3. Click submit and validate message at the end.
    4. Close your browser.
     */

    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#inputEmail4")
    WebElement email;

    @FindBy(css = "#inputPassword4")
    WebElement password;

    @FindBy(css = "#company")
    WebElement company;

    @FindBy(css = "#websitename")
    WebElement website;

    @FindBy(css = "select[name='country']")
    WebElement countryDropdown;

    @FindBy(css = "#inputCity")
    WebElement city;

    @FindBy(css = "#inputAddress1")
    WebElement address1;

    @FindBy(css = "#inputAddress2")
    WebElement address2;

    @FindBy(css = "#inputState")
    WebElement state;

    @FindBy(css = "#inputZip")
    WebElement zipCode;

    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//p[contains(.,'Thanks')]")
    WebElement successMessage;

    public void personalInfo(String name, String email, String password){

        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.password.sendKeys(password);

    }

    public void compWebCountry(String company, String website, String country){
        this.company.sendKeys(company);
        this.website.sendKeys(website);
        BrowserUtils.selectBy(this.countryDropdown, country, "visibleText");
    }

    public void cityAddress1and2(String city, String address1,String address2){
        this.city.sendKeys(city);
        this.address1.sendKeys(address1);
        this.address2.sendKeys(address2);
    }

    public void stateZip(String state, String zipCode){
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
        this.submitBtn.click();
    }

    public String getSuccessMessage(){
        return BrowserUtils.getText(this.successMessage);
    }





}
