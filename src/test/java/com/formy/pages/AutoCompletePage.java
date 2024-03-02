package com.formy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoCompletePage {

    public AutoCompletePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#autocomplete")
    WebElement address;

    @FindBy(css = "#street_number")
    WebElement street;

    public void fillInputFields(String address, String street){
        this.address.sendKeys(address);
        this.street.sendKeys(street);
    }


}
